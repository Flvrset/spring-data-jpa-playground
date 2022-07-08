package com.example.spring_database.model;

import javax.persistence.*;
import java.util.Optional;

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

    private transient Long officeCode;

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


    public String getEmail() {
        return email;
    }

    public Long getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Long employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Offices getOffice() {
        return office;
    }

    public Long getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(Long reportsTo) {
        this.reportsTo = reportsTo;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Long getOfficeCode() {
        return officeCode;
    }
}
