package com.murilo.commerce.models;

import java.io.Serializable;
import java.util.UUID;
import jakarta.persistence.*;

@Entity
@Table(name = "order")
public class OrderModel {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idOrder;
    private double totalPrice;
    public UUID getIdOrder() {
        return idOrder;
    }
    public void setIdOrder(UUID idOrder) {
        this.idOrder = idOrder;
    }
    // private String image; //Alterar para salvar img
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
