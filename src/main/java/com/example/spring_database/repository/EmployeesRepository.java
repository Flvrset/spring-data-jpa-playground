package com.example.spring_database.repository;

import com.example.spring_database.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Long> {

    Optional<Employees> findEmployeeByEmail(String email);
}
