package com.be.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "products")
public class Product {
    @Id
    private String id;
    private String name;
    private String category;
    private double price;
    private String thumbnail;
    private List<String> images;
    private String description;
    private List<String> comments;
    private double rating;
    private int quantity;
    @CreatedDate
    private Date createdAt;
    @LastModifiedDate
    private Date updatedAt;

    // Constructors, getters, and setters
    public String getThumbnail() {
        return thumbnail;
    }

}
