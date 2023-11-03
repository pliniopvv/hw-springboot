package br.com.pvv.hw.spring;

import java.util.Optional;

public record RequestProduct(Optional<Long> id, String name, Integer price) {
	public Product toProduct() {
		Product p = new Product();
		p.setID(this.id().orElse(-1L));
		p.setName(this.name());
		p.setPrice(this.price());
		return p;
	}
}
