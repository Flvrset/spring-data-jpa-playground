package com.example.spring_database.service;

import com.example.spring_database.model.Employees;
import com.example.spring_database.model.Offices;
import com.example.spring_database.repository.EmployeesRepository;
import com.example.spring_database.repository.OfficesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class EmployeesService {

    private final EmployeesRepository employeesRepository;
    private final OfficesRepository officesRepository;

    @Autowired
    public EmployeesService(EmployeesRepository employeesRepository, OfficesRepository officesRepository) {
        this.employeesRepository = employeesRepository;
        this.officesRepository = officesRepository;
    }

    public List<Employees> getEmployees(){
        return employeesRepository.findAll();
    }

    @Transactional
    public void addNewEmployee(Employees employee) {
        Optional<Employees> employeeByEmail = employeesRepository.findEmployeeByEmail(employee.getEmail());
        if (employeeByEmail.isPresent()){
            throw new IllegalStateException("The Employee already exists");
        }
        Optional<Offices> officeById = officesRepository.findById(employee.getOfficeCode());
        if (officeById.isEmpty()){
            throw new IllegalStateException("This office does not exist");
        }
        employee.setOffice(officeById.get());
        employeesRepository.save(employee);
    }
}
