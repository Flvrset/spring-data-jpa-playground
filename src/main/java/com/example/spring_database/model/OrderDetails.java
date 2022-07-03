package com.example.spring_database.model;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="orderdetails")
public class OrderDetails implements Serializable {
    @Id
    private Long orderNumber;

    @OneToOne
    @JoinColumn(name = "order_number", referencedColumnName = "order_number")
    private Orders order;

    @OneToOne
    @JoinColumn(name= "product_code", referencedColumnName = "product_code")
    private Products product;

    @Column(nullable = false)
    private Long quantityOrdered;

    @Column(nullable = false)
    private Float priceEach;

    @Column(nullable = false)
    private Integer orderLineNumber;

    public OrderDetails(Long orderNumber, Products product, Long quantityOrdered, Float priceEach, Integer orderLineNumber) {
        this.orderNumber = orderNumber;
        this.product = product;
        this.quantityOrdered = quantityOrdered;
        this.priceEach = priceEach;
        this.orderLineNumber = orderLineNumber;
    }

    public OrderDetails() {

    }
}
