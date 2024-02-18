package com.workintech.Sprint18Challenge.controller;

import com.workintech.Sprint18Challenge.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workintech/book")
public class BookController {
    @Autowired
    private BookService bookService;

}
