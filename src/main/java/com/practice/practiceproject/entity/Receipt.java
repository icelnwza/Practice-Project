package com.practice.practiceproject.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Receipt {
    @Id
    String receiptId = "";

    String receiptName = "";
    Date date;
}
