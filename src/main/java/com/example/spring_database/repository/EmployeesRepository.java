package com.example.spring_database.repository;

import com.example.spring_database.model.Employees;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends CrudRepository<Employees, Long> {
}
