package com.be.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.be.models.Product;
import com.be.repositories.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ResponseEntity<Product> findProductById(String id) {
        try {
            Product product = productRepository.findById(id).orElseThrow(() -> new Error("Product not found."));
            return new ResponseEntity<Product>(product, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }
    }
}
