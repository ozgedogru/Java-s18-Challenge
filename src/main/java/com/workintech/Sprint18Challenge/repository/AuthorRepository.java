package com.workintech.Sprint18Challenge.repository;

import com.workintech.Sprint18Challenge.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{
}