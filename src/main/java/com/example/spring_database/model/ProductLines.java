package com.example.spring_database.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="productlines")
public class ProductLines {
    @Id
    @Column(length = 50)
    private String productLine;

    @Column(length = 4000)
    private String textDescription;

    @Column
    private String htmlDescription;

    @Column
    private byte[] Image;

    @OneToMany(
            mappedBy = "productLine",
            cascade = CascadeType.ALL
    )
    private List<Products> products = new ArrayList<>();

    public ProductLines(String productLine) {
        this.productLine = productLine;
    }

    public ProductLines() {

    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    public String getHtmlDescription() {
        return htmlDescription;
    }

    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
    }

    public byte[] getImage() {
        return Image;
    }

    public void setImage(byte[] image) {
        Image = image;
    }
}
