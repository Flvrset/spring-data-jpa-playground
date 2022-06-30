package com.example.spring_database.repository;

import com.example.spring_database.model.ProductLines;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductLinesRepository extends CrudRepository<ProductLines, String> {
}
