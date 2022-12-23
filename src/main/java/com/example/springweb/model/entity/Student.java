package com.example.springweb.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table
public class Student implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String name;
}
