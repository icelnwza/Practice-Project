package com.practice.practiceproject.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ReceiptDto {

    String receiptId = "";
    String receiptName = "";
    Date date;
}
