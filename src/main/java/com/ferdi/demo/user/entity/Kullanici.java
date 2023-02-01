package com.ferdi.demo.user.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Formula;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Kullanici implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;
    String name;
    String surname;
    @Embedded
       Address address;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "kullanici")
    @JsonManagedReference
    List<Book> books;

  /*  @Formula("(select surname from kullanici)")
    String sahteSurname;
*/
    public Kullanici( ) {

    }
    public Kullanici(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
