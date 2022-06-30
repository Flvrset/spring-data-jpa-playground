package com.example.spring_database.repository;

import com.example.spring_database.model.Offices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OfficesRepository extends JpaRepository<Offices, Long> {

    Optional<Offices> findOfficesByPhone(String phone);
}
