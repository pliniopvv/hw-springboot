package br.com.pvv.hw.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	public ProductRepository repository;

	@PostMapping
	public ResponseEntity<String> postProduct(@RequestBody RequestProduct body) {
		Product newProduct = body.toProduct();

		this.repository.save(newProduct);
		return ResponseEntity.ok().build();
	}

	@GetMapping
	public ResponseEntity<List<Product>> getAllProducts() {
		List<Product> productsList = this.repository.findAll();

		return ResponseEntity.ok(productsList);
	}

}
