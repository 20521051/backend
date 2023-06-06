package com.be.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "orders")
public class Order {
    @Id
    private String id;
    private String userId;
    private String addressId;
    private List<String> orderItems;
    private double total;
    private String status;
    private String shortId;
    private String paymentMethod;

    // Constructors, getters, and setters

}
