package com.murilo.commerce.models;

import java.io.Serializable;
import java.util.UUID;


import jakarta.persistence.*;

@Entity
@Table(name = "productorder")

public class ProductOrderModel {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProductOrder;
    
    @ManyToOne
    private ProductModel product;
    @ManyToOne
    private OrderModel order;
    private Integer qty = 0;
    private Double unitPrice = 0.0;
    private Double totalPrice = 0.0;

    public UUID getIdProductOrder() {
        return idProductOrder;
    }

    public void setIdProductOrder(UUID idProductOrder) {
        this.idProductOrder = idProductOrder;
    }
    public ProductModel getProduct() {
        return product;
    }
    
    public void setProduct(ProductModel product) {
        this.product = product;
    }

    public OrderModel getOrder() {
        return order;
    }

    public void setOrder(OrderModel order) {
        this.order = order;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
