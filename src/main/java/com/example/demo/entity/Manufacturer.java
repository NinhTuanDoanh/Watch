package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Data
@Entity
@Table(name="manufacturer")
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idmanufacturer;
    @Column(name="name")
    private String name;
    @Column(name="isactive")
    private boolean isActive;
    @Column(name="product_id")
    private int productid;
    @OneToMany(mappedBy = "manufacturer", cascade = CascadeType.ALL)
    private List<Products> productsList;
}
