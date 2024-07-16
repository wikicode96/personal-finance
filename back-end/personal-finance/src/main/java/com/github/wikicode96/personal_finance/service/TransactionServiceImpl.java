package com.github.wikicode96.personal_finance.service;

import com.github.wikicode96.personal_finance.dto.TransactionDTO;
import com.github.wikicode96.personal_finance.entity.TransactionEntity;
import com.github.wikicode96.personal_finance.entity.UserEntity;
import com.github.wikicode96.personal_finance.mapper.TransacionMapper;
import com.github.wikicode96.personal_finance.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService
{
    @Autowired
    private TransacionMapper mapper;

    @Autowired
    private TransactionRepository repository;

    @Override
    public List<TransactionDTO> getTransactionsByMonth(Instant date, Long userId)
    {
        UserEntity user = new UserEntity();
        user.setId(userId);

        ZonedDateTime zdt = date.atZone(ZoneId.systemDefault());
        int month = zdt.getMonthValue();
        int year = zdt.getYear();

        List<TransactionEntity> entities = repository.findTransactionsByMonthAndUser(user, year, month);
        return mapper.transactionEntityToListDTO(entities);
    }

    @Override
    public List<TransactionDTO> getTransactionsByYear(Instant date, Long userId)
    {
        UserEntity user = new UserEntity();
        user.setId(userId);

        ZonedDateTime zdt = date.atZone(ZoneId.systemDefault());
        int year = zdt.getYear();

        List<TransactionEntity> entities = repository.findTransactionsByYearAndUser(user, year);
        return mapper.transactionEntityToListDTO(entities);
    }
}
