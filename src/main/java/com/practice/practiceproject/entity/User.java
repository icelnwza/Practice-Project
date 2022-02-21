package com.practice.practiceproject.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    String id = "";
    String firstName = "";
    String lastName = "";

}
