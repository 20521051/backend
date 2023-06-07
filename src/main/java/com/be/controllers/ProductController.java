package com.be.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import com.be.models.Product;
import com.be.services.ProductService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping()
    public ResponseEntity<Product> getProduct(@RequestBody String id) {
        return productService.findProductById(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getThumbnail(@RequestBody String id) {
        return productService.getThumbnail(id);
    }
}
