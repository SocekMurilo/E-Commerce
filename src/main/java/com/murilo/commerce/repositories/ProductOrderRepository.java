package com.murilo.commerce.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.murilo.commerce.models.ProductOrderModel;

@Repository
public interface ProductOrderRepository extends JpaRepository<ProductOrderModel, UUID>{
    
}
