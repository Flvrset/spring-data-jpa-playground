package com.example.spring_database;

import com.example.spring_database.model.OrderDetails;
import com.example.spring_database.model.Orders;
import com.example.spring_database.model.ProductLines;
import com.example.spring_database.model.Products;
import com.example.spring_database.repository.OrderDetailsRepository;
import com.example.spring_database.repository.OrdersRepository;
import com.example.spring_database.repository.ProductsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.spring_database.repository.ProductLinesRepository;

import java.util.List;

@SpringBootApplication
public class SpringDatabaseApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringDatabaseApplication.class, args);
        ProductLinesRepository productLinesRepository = context.getBean(ProductLinesRepository.class);
        OrderDetailsRepository orderDetailsRepository = context.getBean(OrderDetailsRepository.class);
        ProductsRepository productsRepository = context.getBean(ProductsRepository.class);
        OrdersRepository ordersRepository = context.getBean(OrdersRepository.class);



        ProductLines nivea =  new ProductLines("Nivea");
        Products product = new Products(nivea,
                "1a",
                "Nivea",
                "Big",
                "test",
                "",
                3,
                4.5F,
                3.2F);

        nivea.setProducts(List.of(product));
        productLinesRepository.save(nivea);


        Orders order = new Orders(1L, 1L);
        ordersRepository.save(order);

        OrderDetails orderDetail = new OrderDetails(1L, product, 1L, 1.5F, 1);
        orderDetailsRepository.save(orderDetail);


    }
}
