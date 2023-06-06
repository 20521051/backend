package com.be.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.be.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
