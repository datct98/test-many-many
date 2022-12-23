package com.example.springweb.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.apache.catalina.Service;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "book")
@Data
public class Book{
    @Id
    @GeneratedValue
    private int id;

    private String name;
    @ManyToMany(mappedBy = "books")
    @JsonBackReference
    private Set<Publisher> publishers = new HashSet<>();
}
