package com.be.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "cartItems")
public class CartItem {
    @Id
    private String id;
    private String productId;
    private int quantity;

    // Constructors, getters, and setters

}
