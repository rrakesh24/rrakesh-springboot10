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
@Table(name="STUDENT_TBL")
public class Student {

    @Id
    @GeneratedValue
    private String id;
    private String firstName;
    private String lastName;
}
