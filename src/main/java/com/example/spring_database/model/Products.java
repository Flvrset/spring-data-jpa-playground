package com.example.spring_database.model;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Products {
    @Id
    @Column(length = 15, nullable = false)
    private String productCode;

    @OneToOne
    @NotFound(action = NotFoundAction.IGNORE)
    private OrderDetails order;

    @Column(length = 70, nullable = false)
    private String productName;

    @ManyToOne
    @JoinColumn(name = "product_line")
    public ProductLines productLine;

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

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public String getProductScale() {
        return productScale;
    }

    public void setProductScale(String productScale) {
        this.productScale = productScale;
    }

    public String getProductVendor() {
        return productVendor;
    }

    public void setProductVendor(String productVendor) {
        this.productVendor = productVendor;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public Float getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Float buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Float getMSRP() {
        return MSRP;
    }

    public void setMSRP(Float MSRP) {
        this.MSRP = MSRP;
    }
}
