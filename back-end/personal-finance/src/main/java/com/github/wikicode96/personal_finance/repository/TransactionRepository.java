package com.github.wikicode96.personal_finance.repository;

import com.github.wikicode96.personal_finance.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {
}
