package com.example.spring_database;

import com.example.spring_database.model.ProductLines;
import com.example.spring_database.model.Products;
import com.example.spring_database.repository.ProductsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.spring_database.repository.ProductLinesRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDatabaseApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringDatabaseApplication.class, args);
        ProductLinesRepository productLinesRepository = context.getBean(ProductLinesRepository.class);

        ProductLines nivea =  new ProductLines("Nivea");
        ProductLines Ziaja = new ProductLines("Ziaja");
        Products product = new Products(nivea,
                "1a",
                "Nivea",
                "Big",
                "test",
                "",
                3,
                4.5F,
                3.2F);

        Products product2 = new Products(nivea,
                "2b",
                "NiveaNew",
                "Small",
                "testik",
                "",
                2,
                4.45F,
                3.2F);

        List<Products>  products = Arrays.asList(product, product2);
        nivea.setProducts(products);
        productLinesRepository.save(nivea);
        productLinesRepository.save(Ziaja);


        ProductLines searchedProductLine = productLinesRepository.findById("Ziaja").get();

        Products product3 = new Products(searchedProductLine,
                "", "", "", "", "", 4, 4F, 4F);

        searchedProductLine.setProducts(List.of(product3));
        productLinesRepository.save(searchedProductLine);
    }
}
