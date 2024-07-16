package com.github.wikicode96.personal_finance.controller;

import com.github.wikicode96.personal_finance.command.TransactionsByMonthCommand;
import com.github.wikicode96.personal_finance.command.TransactionsByYearCommand;
import com.github.wikicode96.personal_finance.dto.TransactionDTO;
import com.github.wikicode96.personal_finance.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController
{
    @Autowired
    private TransactionService service;

    @GetMapping("/months")
    List<TransactionDTO> getTransactionsByMonth(@RequestBody TransactionsByMonthCommand command)
    {
        return service.getTransactionsByMonth(
                command.getDate(),
                command.getUserId()
        );
    }

    @GetMapping(value = "/years", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<TransactionDTO> getTransactionsByYear(@RequestBody TransactionsByYearCommand command)
    {
        return service.getTransactionsByYear(
                command.getDate(),
                command.getUserId()
        );
    }
}
