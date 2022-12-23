package com.example.springweb.service;

import com.example.springweb.model.entity.Book;
import com.example.springweb.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    @Transactional(rollbackFor = {SQLException.class, RuntimeException.class})
    public void testPage()  {
        Page<Book> books = bookRepository.findAll(PageRequest.of(0,3));
        List<Book> bookList = books.getContent();
        System.out.println("Page đầu tiên");
        bookList.forEach(System.out::println);

        System.out.println("Page tiếp theo");
        Page<Book> nextPage =  bookRepository.findAll(books.nextPageable());
        nextPage.getContent().forEach(System.out::println);
    }
}
