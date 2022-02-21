package com.practice.practiceproject.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class ProductList {

    @Id
    String prodListId = "";

    String prodListName = "";
}
