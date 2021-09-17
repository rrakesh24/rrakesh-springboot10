package com.example.test;

import com.example.test.entity.Book;
import com.example.test.repository.BookRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookRepositoryTest {
    @Autowired
    private BookRepository bookRepository;

    @Test
    public void addBookTests()
    {
        Book book =new Book(2,"Rajesh","APJ");
        bookRepository.save(book);
        Assertions.assertNotNull(bookRepository.findById(2));
    }
}
