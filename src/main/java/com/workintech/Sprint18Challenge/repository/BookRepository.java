package com.workintech.Sprint18Challenge.repository;

import com.workintech.Sprint18Challenge.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
