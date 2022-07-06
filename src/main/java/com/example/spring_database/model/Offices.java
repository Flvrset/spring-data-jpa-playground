package com.example.spring_database.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="offices")
public class Offices {
    @Id
    @GeneratedValue
    private Long officeCode;

    private String city;

    private String phone;

    private String addressLine1;

    private String addressLine2;

    private String country;

    private String postalCode;

    private String territory;

    @OneToMany(mappedBy = "office", cascade = CascadeType.ALL)
    private Set<Employees> employeesSet;

    public Offices(String city, String phone, String addressLine1, String country, String postalCode) {
        this.city = city;
        this.phone = phone;
        this.addressLine1 = addressLine1;
        this.country = country;
        this.postalCode = postalCode;
    }

    public Offices() {

    }
}
