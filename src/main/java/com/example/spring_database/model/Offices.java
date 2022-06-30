package com.example.spring_database.model;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="offices")
public class Offices {
    @Id
    @Column(length =10, nullable = false)
    private String officeCode;

    @Column(length = 50, nullable = false)
    private String city;

    @Column( length = 50, nullable = false)
    private String phone;

    @Column(length = 50, nullable = false)
    private String addressLine1;

    @Column(length = 50)
    private String addressLine2;

    @Column(length= 50, nullable = false)
    private String country;

    @Column(length = 15, nullable = false)
    private String postalCode;

    @Column(length = 10, nullable = false)
    private String territory;

}
