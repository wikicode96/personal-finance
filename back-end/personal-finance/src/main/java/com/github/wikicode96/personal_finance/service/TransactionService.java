package com.github.wikicode96.personal_finance.service;

import com.github.wikicode96.personal_finance.dto.TransactionDTO;

import java.time.Instant;
import java.util.List;

public interface TransactionService
{
    List<TransactionDTO> getTransactionsByMonth(Instant date, Long userId);
    List<TransactionDTO> getTransactionsByYear(Instant date, Long userId);
}
