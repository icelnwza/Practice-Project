package com.practice.practiceproject.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Product {

    @Id
    String prod_id = "";

    String prod_name = "";
    int price = 0;
    int qty = 0;
}
