package com.murilo.commerce.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.murilo.commerce.dtos.CartDto;
import com.murilo.commerce.dtos.ProductDto;
import com.murilo.commerce.models.ProductModel;
import com.murilo.commerce.models.ProductOrderModel;
import com.murilo.commerce.repositories.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    ProductRepository prodRepo;

    private List<ProductOrderModel> productOrder = new ArrayList<ProductOrderModel>();

    @GetMapping
    public ResponseEntity<List<ProductOrderModel>> getCart() {
        // Verifique o conteúdo da lista antes de retornar
        System.out.println("Conteúdo do carrinho: " + productOrder);
        return ResponseEntity.ok(new ArrayList<>(productOrder));  // Retorna uma cópia para evitar modificações externas
    }

    @PostMapping
    public ResponseEntity<ProductOrderModel> getMethodName(@RequestBody CartDto cartDto) {
        // Optional<ProductModel> product = prodRepo.findById(id);
        Optional<ProductModel> product = prodRepo.findByName(cartDto.productName());
        if (product.isPresent()) {
            ProductModel prod = product.get();
            ProductOrderModel prodOrder = new ProductOrderModel(); 
            prodOrder.setProduct(prod);
            prodOrder.setUnitPrice(prod.getPrice());  // Define unitPrice com base no preço do produto
            prodOrder.setQty(cartDto.qty());
            prodOrder.setTotalPrice(prodOrder.getQty() * prodOrder.getUnitPrice());
            productOrder.add(prodOrder);
    
            return ResponseEntity.ok(prodOrder);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
}