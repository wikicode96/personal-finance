package com.github.wikicode96.personal_finance.service;

import com.github.wikicode96.personal_finance.command.TransactionsByMonthCommand;
import com.github.wikicode96.personal_finance.command.TransactionsByYearCommand;
import com.github.wikicode96.personal_finance.dto.TransactionDTO;

public class TransactionServiceImpl implements TransactionService {

    @Override
    public TransactionDTO getTransactionsByMonth(TransactionsByMonthCommand command) {
        return null;
    }

    @Override
    public TransactionDTO getTransactionsByYear(TransactionsByYearCommand command) {
        return null;
    }
}
