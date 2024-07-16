package com.github.wikicode96.personal_finance.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDTO
{
    private Long id;
    private String name;
    private float amount;
    private Instant transactionDate;
    private CategoryDTO category;
    private UserDTO user;
}
