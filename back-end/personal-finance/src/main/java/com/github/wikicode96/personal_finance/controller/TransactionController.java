package com.github.wikicode96.personal_finance.controller;

import com.github.wikicode96.personal_finance.dto.TransactionDTO;
import com.github.wikicode96.personal_finance.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@CrossOrigin(origins = "")
@RequestMapping("/transactions")
public class TransactionController
{
    @Autowired
    private TransactionService service;

    @GetMapping("/{userId}")
    List<TransactionDTO> getTransactions(@PathVariable Long userId)
    {
        return service.getTransactionsByUserId(userId);
    }
}
