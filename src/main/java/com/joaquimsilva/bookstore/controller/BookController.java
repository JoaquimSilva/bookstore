package com.joaquimsilva.bookstore.controller;

import com.joaquimsilva.bookstore.dto.MessageResponseDTO;
import com.joaquimsilva.bookstore.entity.Book;
import com.joaquimsilva.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book) {
    return bookService.create(book);
    }
}
