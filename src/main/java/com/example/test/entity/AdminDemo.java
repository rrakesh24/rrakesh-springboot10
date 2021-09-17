package com.example.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Demo_TBL")
public class AdminDemo {

    @Id
    @GeneratedValue
    private int id;
    private String Name;
    private String companyName;
}
