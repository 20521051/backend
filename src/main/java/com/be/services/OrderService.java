package com.be.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.be.models.Order;
import com.be.repositories.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public ResponseEntity<Order> findOrderById(String id) {
        try {
            Order order = orderRepository.findById(id).orElseThrow(() -> new Error("Order not found."));
            return new ResponseEntity<Order>(order, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
            return new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
        }
    }
}
