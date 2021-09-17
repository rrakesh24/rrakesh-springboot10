package com.example.test.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="EMPLOYEE_TBL")
public class Employee {

    @Id
    @GeneratedValue
    private int employeeId;
    private String firstName;
    private String lastName;
    private int salary;
}
