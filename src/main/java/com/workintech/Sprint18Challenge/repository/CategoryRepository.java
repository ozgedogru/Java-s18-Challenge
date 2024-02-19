package com.workintech.Sprint18Challenge.repository;

import com.workintech.Sprint18Challenge.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
