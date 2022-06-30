package com.example.spring_database.model;

import javax.persistence.*;

@Entity
@Table(name="orderdetails")
public class OrderDetails {
    @Id
    private Long orderNumber;

    @Column(length = 15, nullable = false)
    private String productCode;

    @OneToOne(mappedBy = "order")
    @JoinColumn(name= "product_code")
    private Products product;

    @Column(nullable = false)
    private Long quantityOrdered;

    @Column(nullable = false)
    private Float priceEach;

    @Column(nullable = false)
    private Integer orderLineNumber;


}
