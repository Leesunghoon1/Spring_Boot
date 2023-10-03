package com.example.demo.entity;


import lombok.Data;

@Data

public abstract class Entity implements PrimaryKey{


    private long id;
}
