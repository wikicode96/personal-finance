package com.github.wikicode96.personal_finance.service;

import com.github.wikicode96.personal_finance.command.TransactionsByMonthCommand;
import com.github.wikicode96.personal_finance.command.TransactionsByYearCommand;
import com.github.wikicode96.personal_finance.dto.TransactionDTO;

public interface TransactionService {
    TransactionDTO getTransactionsByMonth(TransactionsByMonthCommand command);
    TransactionDTO getTransactionsByYear(TransactionsByYearCommand command);
}
