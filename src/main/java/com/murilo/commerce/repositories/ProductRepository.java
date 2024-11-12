package com.murilo.commerce.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.murilo.commerce.models.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID>{
    // List<ProductModel> findAllProducts();
    // List<ProductModel> findByProducts(String idProduct);
    Optional<ProductModel> findByName(String name);
}
