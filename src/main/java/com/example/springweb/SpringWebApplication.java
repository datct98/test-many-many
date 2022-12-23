package com.example.springweb;

import com.example.springweb.model.entity.Book;
import com.example.springweb.model.entity.Publisher;
import com.example.springweb.repository.BookRepository;
import com.example.springweb.repository.PublisherRepository;
import com.example.springweb.service.BookService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SpringWebApplication extends ServletInitializer implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebApplication.class, args);
    }

    @Autowired
    private PublisherRepository publisherRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    BookService bookService;

    @Override

    public void run(String... args) throws Exception {
        /*System.setProperty("webdriver.chrome.driver",
                "E:\\SeleniumWebdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();*/
        //driver.get("https://shopee.vn/");


        /*Book book = new Book();
        book.setName("B1");
        Book book2 = new Book();
        book.setName("B2");
        Set<Book> set = new HashSet<>(Arrays.asList(book, book2));

        Publisher publisher = new Publisher();
        publisher.setName("P1");
        publisher.setBooks(set);
        publisherRepository.save(publisher);*/
        //bookService.testPage();
    }
}
