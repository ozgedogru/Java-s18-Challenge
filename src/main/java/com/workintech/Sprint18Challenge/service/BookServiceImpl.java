package com.workintech.Sprint18Challenge.service;

import com.workintech.Sprint18Challenge.entity.Book;
import com.workintech.Sprint18Challenge.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService{
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public Book getBookById(Long id) {
        return null;
    }

    @Override
    public void addBook(Book book, Long categoryId) {

    }

    @Override
    public void saveByAuthor(Long categoryId, Long authorId) {

    }

    @Override
    public void updateBook(Long id, Book book) {

    }

    @Override
    public void deleteBook(Long id) {

    }
}
