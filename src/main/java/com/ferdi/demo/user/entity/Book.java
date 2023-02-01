package com.ferdi.demo.user.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
    String name;
    String author;
    @ManyToOne(cascade = CascadeType.ALL)
    @JsonBackReference
    Kullanici kullanici;

    public Book( ) {

    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
}
