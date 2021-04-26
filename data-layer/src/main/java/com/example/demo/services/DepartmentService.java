package com.example.demo.services;

import com.example.demo.models.Department;
import com.example.demo.models.Employee;
import com.example.demo.repositories.CRUDRepository;

public class DepartmentService {
    public boolean doesEmployeeWorkInDepartment(Employee e, Department d){
        return e.getDepartmentNumber() == d.getDepartmentNumber();
    }
}
