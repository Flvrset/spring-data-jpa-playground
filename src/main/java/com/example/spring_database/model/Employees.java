package com.example.spring_database.model;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employees {
    @Id
    @GeneratedValue
    private Long employeeNumber;

    private String lastName;

    private String firstName;

    private String extension;

    private String email;

    @ManyToOne
    @JoinColumn(name="office_code")
    private Offices office;

    private Long reportsTo;

    private String jobTitle;

    public Employees(String lastName, String firstName, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
    }

    public Employees() {

    }

    public void setOffice(Offices office) {
        this.office = office;
    }
}
