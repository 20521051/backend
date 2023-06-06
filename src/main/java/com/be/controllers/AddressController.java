package com.be.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import com.be.models.Address;
import com.be.services.AddressService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping()
    public ResponseEntity<Address> deleteAddress(@RequestBody String id) {
        return addressService.findAddressById(id);
    }
}
