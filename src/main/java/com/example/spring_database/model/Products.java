package com.example.spring_database.model;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Products {
    @Id
    @Column(length = 15, nullable = false, name = "product_code")
    private String productCode;

    @Column(length = 70, nullable = false)
    private String productName;

    @ManyToOne
    @JoinColumn(name = "product_line")
    private ProductLines productLine;

    @Column(length = 10, nullable = false)
    private String productScale;

    @Column(length = 50, nullable = false)
    private String productVendor;

    @Column(nullable = false)
    private String productDescription;

    @Column(nullable = false)
    private Integer quantityInStock;

    @Column(nullable = false)
    private Float buyPrice;

    @Column(nullable = false)
    private Float MSRP;

    public Products(ProductLines productLine,
                    String productCode,
                    String productName,
                    String productScale,
                    String productVendor,
                    String productDescription,
                    Integer quantityInStock,
                    Float buyPrice,
                    Float MSRP) {
        this.productCode = productCode;
        this.productName = productName;
        this.productLine = productLine;
        this.productScale = productScale;
        this.productVendor = productVendor;
        this.productDescription = productDescription;
        this.quantityInStock = quantityInStock;
        this.buyPrice = buyPrice;
        this.MSRP = MSRP;
    }

    public Products() {

    }
}
