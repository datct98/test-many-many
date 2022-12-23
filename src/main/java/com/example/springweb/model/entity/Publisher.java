package com.example.springweb.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "publisher")
@Data
public class Publisher{
    @Id
    @GeneratedValue
    private int id;

    private String name;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "publisher_book",
            joinColumns = @JoinColumn(name = "publisher_id"), // Tạo FK join với id của class hiện tại Publisher
            inverseJoinColumns = @JoinColumn(name = "book_id")) // FK join với id Book
    @JsonManagedReference
    private Set<Book> books = new HashSet<>();
}
