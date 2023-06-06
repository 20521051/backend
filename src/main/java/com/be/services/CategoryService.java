package com.be.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.be.models.Category;
import com.be.repositories.CategoryRepository;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public ResponseEntity<Category> findCategoryById(String id) {
        try {
            Category category = categoryRepository.findById(id).orElseThrow(() -> new Error("Category not found."));
            return new ResponseEntity<Category>(category, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
            return new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
        }
    }
}
