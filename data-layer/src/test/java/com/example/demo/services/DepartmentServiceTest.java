package com.example.demo.services;

import com.example.demo.models.Department;
import com.example.demo.models.Employee;
import com.example.demo.repositories.CRUDRepository;
import com.example.demo.repositories.TestEmployeeRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentServiceTest {

    @Test
    void doesEmployeeWorkInDepartment() {
        //Arrange
        DepartmentService service = new DepartmentService();
        Employee e = new Employee(1,"Nicklas","Adjunkt",4,null,1,2,15);
        Department d = new Department(10, "Sales","Chicago");

        //Act
        boolean expected = true;
        boolean actual = service.doesEmployeeWorkInDepartment(e,d);

        //Assert
        assertEquals(expected,actual);
    }
}
