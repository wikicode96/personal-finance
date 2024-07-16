package com.github.wikicode96.personal_finance.repository;

import com.github.wikicode96.personal_finance.entity.TransactionEntity;
import com.github.wikicode96.personal_finance.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity, Long>
{
    @Query("SELECT t FROM TransactionEntity t WHERE t.user = :user AND FUNCTION('YEAR', t.transactionDate) = :year AND FUNCTION('MONTH', t.transactionDate) = :month")
    List<TransactionEntity> findTransactionsByMonthAndUser(@Param("user") UserEntity user, @Param("year") int year, @Param("month") int month);

    @Query("SELECT t FROM TransactionEntity t WHERE t.user = :user AND FUNCTION('YEAR', t.transactionDate) = :year")
    List<TransactionEntity> findTransactionsByYearAndUser(@Param("user") UserEntity user, @Param("year") int year);
}
