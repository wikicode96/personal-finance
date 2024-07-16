package com.github.wikicode96.personal_finance.dto;

import java.time.Instant;

public class TransactionDTO {
    private Long id;
    private String name;
    private float amount;
    private Instant transactionDate;
    private CategoryDTO category;
    private UserDTO user;
}
