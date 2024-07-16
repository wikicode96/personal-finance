package com.github.wikicode96.personal_finance.mapper;

import com.github.wikicode96.personal_finance.dto.TransactionDTO;
import com.github.wikicode96.personal_finance.entity.TransactionEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface TransacionMapper
{
    TransactionDTO transactionEntityToDTO(TransactionEntity source);
    List<TransactionDTO> transactionEntityToListDTO(List<TransactionEntity> sourceList);
}
