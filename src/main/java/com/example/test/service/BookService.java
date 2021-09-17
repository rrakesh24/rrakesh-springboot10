package com.example.test.service;

import com.example.test.entity.Book;
import com.example.test.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> findBook(String name)
    {
       return bookRepository.findByBookName(name);
    }
}
