package com.example.demo.repositories;

import com.example.demo.models.Employee;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestEmployeeRepository implements CRUDRepository{
    @Override
    public List getAll() {
        List<Employee> testData = new ArrayList<Employee>(Arrays.asList(
            new Employee(1,"Nicklas","Adjunkt",4,null,1,2,3),
            new Employee(1,"Nicklas","Adjunkt",4,null,1,2,3)
        ));
        return testData;
    }
}
