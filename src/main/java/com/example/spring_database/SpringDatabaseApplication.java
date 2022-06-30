package com.example.spring_database;

import com.example.spring_database.model.Employees;
import com.example.spring_database.model.Offices;
import com.example.spring_database.repository.EmployeesRepository;
import com.example.spring_database.repository.OfficesRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringDatabaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringDatabaseApplication.class, args);
    }
}
