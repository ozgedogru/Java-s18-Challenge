package com.workintech.Sprint18Challenge.service;

import com.workintech.Sprint18Challenge.entity.Book;

import java.util.List;

public interface BookService{
    List<Book> getAllBooks();
    Book getBookById(Long id);
    void addBook(Book book, Long categoryId);
    void saveByAuthor(Long categoryId, Long authorId);
    void updateBook(Long id, Book book);
    void deleteBook(Long id);
}
