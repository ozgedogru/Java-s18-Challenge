package com.workintech.Sprint18Challenge.service;

import com.workintech.Sprint18Challenge.entity.Book;
import com.workintech.Sprint18Challenge.repository.AuthorRepository;
import com.workintech.Sprint18Challenge.repository.BookRepository;
import com.workintech.Sprint18Challenge.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private AuthorRepository authorRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

}