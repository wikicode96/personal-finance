package com.github.wikicode96.personal_finance.service;

import com.github.wikicode96.personal_finance.dto.TransactionDTO;

import java.util.List;

public interface TransactionService
{
    List<TransactionDTO> getTransactionsByUserId(Long userId);
}
