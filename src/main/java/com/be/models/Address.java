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
@Document(collection = "addresses")
public class Address {
    @Id
    private String id;
    private String province;
    private String district;
    private String ward;
    private String specificAddress;
    private String phone;
    private String receiver;
    private Boolean isDefault;
    private Boolean deleted;

    // Constructors, getters, and setters

}
