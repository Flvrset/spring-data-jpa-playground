package com.example.spring_database.model;


import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "orders")
public class Orders implements Serializable {

    @Id
    @Column(name="order_number")
    private Long orderNumber;

    private Date orderDate;

    private Date requiredDate;

    private Date shippedDate;

    private String status;

    private String comments;

    private Long customerNumber;

    public Orders(Long orderNumber, Long customerNumber) {
        this.orderNumber = orderNumber;
        this.customerNumber = customerNumber;
    }

    public Orders() {

    }
}
