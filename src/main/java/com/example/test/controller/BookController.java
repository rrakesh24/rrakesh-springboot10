package com.example.test.controller;

import com.example.test.entity.Book;
import com.example.test.repository.BookRepository;
import com.example.test.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class BookController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookService bookService;
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

    @GetMapping("/author")
    public List<Book> getBookByAuthor(@RequestParam("name")  String name)
    {
       return  bookRepository.findByBookName(name);
    }

    @GetMapping("/author/{authName}")
    public List<Book> getByAuthor(@PathVariable String authName)
    {
       return  bookRepository.findByBookName(authName);
    }
}
