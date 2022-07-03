package com.example.spring_database.repository;

import com.example.spring_database.model.OrderDetails;
import com.example.spring_database.model.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Long> {
}
