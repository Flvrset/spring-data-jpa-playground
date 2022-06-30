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

    @Override
    public String toString() {
        return "Offices{" +
                "officeCode=" + officeCode +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", territory='" + territory + '\'' +
                ", employeesSet=" + employeesSet +
                '}';
    }

    public String getPhone() {
        return this.phone;
    }

    public Long getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(Long officeCode) {
        this.officeCode = officeCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    public Set<Employees> getEmployeesSet() {
        return employeesSet;
    }

    public void setEmployeesSet(Set<Employees> employeesSet) {
        this.employeesSet = employeesSet;
    }
}
