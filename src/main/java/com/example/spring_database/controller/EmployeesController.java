package com.example.spring_database.controller;

import com.example.spring_database.model.Employees;
import com.example.spring_database.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/employees")
public class EmployeesController {

    private final EmployeesService employeesService;

    @Autowired
    public EmployeesController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @GetMapping
    public List<Employees> getEmployees() {
        return employeesService.getEmployees();
    }

    @PostMapping()
    public void registerEmployee(@RequestBody Employees employee){
        employeesService.addNewEmployee(employee);
    }

}
