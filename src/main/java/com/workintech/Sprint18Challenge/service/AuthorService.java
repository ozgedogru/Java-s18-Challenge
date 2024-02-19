package com.workintech.Sprint18Challenge.service;

import com.workintech.Sprint18Challenge.entity.Author;
import com.workintech.Sprint18Challenge.entity.Book;
import com.workintech.Sprint18Challenge.repository.AuthorRepository;
import com.workintech.Sprint18Challenge.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

}