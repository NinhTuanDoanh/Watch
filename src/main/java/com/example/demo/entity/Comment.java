package com.example.demo.entity;

import lombok.Data;
import org.hibernate.annotations.Columns;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcomment;
    @Column(name="content")
    private String content;
    @Column(name="create_at")
    private LocalDateTime createat;
    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;
    @ManyToOne
    @JoinColumn(name="product_id")
    private Products products;

}
