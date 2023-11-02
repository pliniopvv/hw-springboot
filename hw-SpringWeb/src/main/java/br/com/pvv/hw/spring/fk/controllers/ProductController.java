package br.com.pvv.hw.spring.fk.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pvv.hw.spring.fk.domain.product.Product;
import br.com.pvv.hw.spring.fk.domain.product.ProductRepository;
import br.com.pvv.hw.spring.fk.domain.product.RequestProduct;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductRepository repository;

	@GetMapping
	public ResponseEntity getAllProducts() {
		var allProducts = repository.findAllByActiveTrue();
		return ResponseEntity.ok(allProducts);
	}

	@PostMapping
	public ResponseEntity registerProduct(@RequestBody @Valid RequestProduct data) {
		Product product = new Product(data);
		System.out.println(data);
		repository.save(product);
		return ResponseEntity.ok().build();
	}

	@PutMapping
	@Transactional
	public ResponseEntity updateProduct(@RequestBody @Valid RequestProduct data) {
		System.out.println(data);
		Optional<Product> oproduct = repository.findById(data.id());
		if (oproduct.isPresent()) {
			Product product = oproduct.get();
			product.setName(data.name());
			product.setPrice_in_cents(data.price_in_cents());
			return ResponseEntity.ok(product);
		} else {
			throw new EntityNotFoundException();
		}
	}

	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity deleteProduct(@PathVariable String id) {
		Optional<Product> oproduct = repository.findById(id);
		if (oproduct.isPresent()) {
			Product product = oproduct.get();
			product.setActive(false);
			return ResponseEntity.noContent().build();
		} else {
			throw new EntityNotFoundException();
		}
	}
}
