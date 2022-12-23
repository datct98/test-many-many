package com.example.springweb.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String password;
    @Column(columnDefinition = "varchar(10) default 'U'")
    private String role;
}
