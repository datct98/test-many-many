package com.example.springweb.controller;

import com.example.springweb.model.entity.Book;
import com.example.springweb.repository.BookRepository;
import com.example.springweb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookService bookService;

    @RequestMapping("/book/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id){
        Book book = bookRepository.getReferenceById(id);

        return ResponseEntity.ok(book);
    }
}
