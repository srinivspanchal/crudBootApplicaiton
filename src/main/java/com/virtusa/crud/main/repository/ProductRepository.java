package com.virtusa.crud.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.crud.main.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
