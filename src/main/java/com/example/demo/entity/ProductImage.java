package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="product_image")
@Entity
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imageid;
    @Column(name="url")
    private String url;
    @Column(name="isactive")
    private boolean isactive;
    @ManyToOne()
    @JoinColumn(name = "product_id")
    private Products products;

}
