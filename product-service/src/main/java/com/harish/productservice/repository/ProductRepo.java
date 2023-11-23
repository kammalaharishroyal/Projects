package com.harish.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.harish.productservice.entity.Product;

public interface ProductRepo extends MongoRepository<Product, String> {

}
