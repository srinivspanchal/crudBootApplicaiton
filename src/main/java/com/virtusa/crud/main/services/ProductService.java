package com.virtusa.crud.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.crud.main.entity.Product;
import com.virtusa.crud.main.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public Product saveProduct(Product product) {

		return repository.save(product);
	}

	public List<Product> getProducts() {

		return repository.findAll();

	}

	public Product getProductsById(int id) {

		return repository.findById(id).orElse(null);

	}

	public Product updateProduct(Product product) {

		Product existingProduct = repository.findById(product.getId()).orElse(product);
		existingProduct.setProductName(product.getProductName());
		existingProduct.setPrice(product.getPrice());
		existingProduct.setQuantity(product.getQuantity());
		repository.save(existingProduct);
		return existingProduct;

	}

}
