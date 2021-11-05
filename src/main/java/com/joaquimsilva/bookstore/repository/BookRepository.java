package com.joaquimsilva.bookstore.repository;

import com.joaquimsilva.bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {

}
