package com.be.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.be.models.Admin;

@Repository
public interface AdminRepository extends MongoRepository<Admin, String> {
}
