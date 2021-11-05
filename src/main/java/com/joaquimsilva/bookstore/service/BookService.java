package com.joaquimsilva.bookstore.service;

import com.joaquimsilva.bookstore.dto.MessageResponseDTO;
import com.joaquimsilva.bookstore.entity.Book;
import com.joaquimsilva.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public MessageResponseDTO create(Book book) {
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder().message("Book created whith ID: " + book.getId()).build();
    }
}
