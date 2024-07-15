package com.github.wikicode96.personal_finance.repository;

import com.github.wikicode96.personal_finance.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
