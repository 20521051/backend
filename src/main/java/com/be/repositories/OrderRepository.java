package com.be.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.be.models.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
}
