package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="orderdetail")
@Entity
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrderDetail;
    @Column(name="quantity")
    private int quantity;
    @Column(name="price")
    private int price;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products products;
    @ManyToOne
    @JoinColumn(name="idorder")
    private Order order;
}
