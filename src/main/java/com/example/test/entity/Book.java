package com.example.test.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name="BOOK_TBL")
public class Book {
    @Id
    @GeneratedValue
    private int bookId;
    private String bookName;
    private String author;
}
