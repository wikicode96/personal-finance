package com.github.wikicode96.personal_finance.repository;

import com.github.wikicode96.personal_finance.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long>
{
}
