package ru.avbugorov.productservice.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private Integer price;

}

//    @ManyToOne
//    @JoinColumn(name = "category_id")
//    private Category category;


