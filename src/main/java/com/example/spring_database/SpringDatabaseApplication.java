package com.example.spring_database;

import com.example.spring_database.model.Employees;
import com.example.spring_database.model.Offices;
import com.example.spring_database.repository.EmployeesRepository;
import com.example.spring_database.repository.OfficesRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringDatabaseApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringDatabaseApplication.class, args);
        OfficesRepository officesRepository = context.getBean(OfficesRepository.class);
        EmployeesRepository employeesRepository = context.getBean(EmployeesRepository.class);

        Offices biuro1 = new Offices("Bielsko", "123456789", "3 Maja", "Poland", "43-385");
        Employees marek = new Employees("Kowalski", "Marek", "maromaro@gmail.com");
        marek.setOffice(biuro1);
        Employees basia = new Employees("Szota", "Basia", "email@email.com");
        basia.setOffice(biuro1);
        officesRepository.save(biuro1);
        employeesRepository.saveAll(Arrays.asList(marek, basia));


    }
}
