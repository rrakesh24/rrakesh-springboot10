package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookRepository bookRepository;
    @GetMapping("/findAllBooks")
    public List<Book> getBooks()
    {
        return bookRepository.findAll();
    }

    @PostMapping("/addBook")
    public String saveBook(@RequestBody  Book book)
    {
        bookRepository.save(book);
        return "Book added with Id:"+book.getBookId();
    }
    @PostMapping("/addAllBook")
    public List<Book> saveAllBook(@RequestBody  List<Book> books)
    {
        return bookRepository.saveAll(books);
    }

}
