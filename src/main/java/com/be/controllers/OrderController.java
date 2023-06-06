package com.be.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import com.be.models.Order;
import com.be.services.OrderService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping()
    public ResponseEntity<Order> deleteOrder(@RequestBody String id) {
        return orderService.findOrderById(id);
    }
}
