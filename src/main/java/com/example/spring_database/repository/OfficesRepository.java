package com.example.spring_database.repository;

import com.example.spring_database.model.Offices;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficesRepository extends CrudRepository<Offices, Long> {
}
