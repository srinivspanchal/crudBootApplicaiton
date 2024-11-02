package com.virtusa.crud.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.crud.main.entity.Product;
import com.virtusa.crud.main.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping("/saveProducts")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
		Product productResponse = service.saveProduct(product);
		if (productResponse != null) {
			return new ResponseEntity<Product>(product, HttpStatus.ACCEPTED);
		} else {
			return new ResponseEntity<Product>(product, HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping("/getProducts")
	public List<Product> getProducts() {

		List<Product> products = service.getProducts();
		return products;

	}

	@GetMapping("/{id}")
	public Product getProductsById(@PathVariable int id) {
		return service.getProductsById(id);

	}

	@PutMapping("update")
	public Product updateProductById(@RequestBody Product product) {
		return service.updateProduct(product);

	}

}
