package com.murilo.commerce.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.murilo.commerce.models.ProductOrderModel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController("/cart")
public class CartController {

    private List<ProductOrderModel> procuctOrder = new ArrayList<ProductOrderModel>();

    @GetMapping("/addcart/{id}")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
}
