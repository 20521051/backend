package com.be.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.be.models.Address;
import com.be.repositories.AddressRepository;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public ResponseEntity<Address> findAddressById(String id) {
        try {
            Address address = addressRepository.findById(id).orElseThrow(() -> new Error("Address not found."));
            return new ResponseEntity<Address>(address, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
            return new ResponseEntity<Address>(HttpStatus.NOT_FOUND);
        }
    }
}
