package com.github.wikicode96.personal_finance.service;

import com.github.wikicode96.personal_finance.dto.TransactionDTO;
import com.github.wikicode96.personal_finance.entity.TransactionEntity;
import com.github.wikicode96.personal_finance.entity.UserEntity;
import com.github.wikicode96.personal_finance.mapper.TransacionMapper;
import com.github.wikicode96.personal_finance.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService
{
    @Autowired
    private TransacionMapper mapper;

    @Autowired
    private TransactionRepository repository;

    @Override
    public List<TransactionDTO> getTransactionsByUserId(Long userId)
    {
        UserEntity user = new UserEntity();
        user.setId(userId);

        List<TransactionEntity> entities = repository.findTransactionsByUser(user);
        return mapper.transactionEntityToListDTO(entities);
    }
}
