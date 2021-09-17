package com.example.test;

import com.example.test.entity.Book;
import com.example.test.repository.BookRepository;
import com.example.test.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.when;

@SpringBootTest
public class MockitoTest {
    @Autowired
    private BookService bookService;
    @MockBean
    private BookRepository bookRepository;

    @Test
    public void getBooksTest() {
        when(bookRepository.findByBookName("WOF")).
                thenReturn(Stream.of(new Book(32, "WOF", "APJ"),new Book(5,"WOF","Rockey"))
                        .collect(Collectors.toList()));
        Assertions.assertEquals(2, bookService.findBook("WOF").size());
    }
}
