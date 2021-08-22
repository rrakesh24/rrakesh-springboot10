package com.example.demo;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeRepoTest {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void saveEmployeeTest()
    {
        Employee employee=new Employee();
        employee.setEmployeeId(105);
        employee.setFirstName("JUNIT Testing");
        employee.setLastName("Unit Testing");
        employee.setSalary(10000);
        employeeRepository.save(employee);

        Assertions.assertThat(employee.getEmployeeId()).isGreaterThan(0);

    }

    @Test
    public void getEmployeeTest()
    {
        Employee employee=employeeRepository.findById(22).get();
        Assertions.assertThat(employee.getEmployeeId()).isEqualTo(21);
    }

}
