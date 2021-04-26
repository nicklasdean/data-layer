package com.example.demo.controllers;

import com.example.demo.models.Employee;
import com.example.demo.repositories.CRUDRepository;
import com.example.demo.repositories.DepartmentRepository;
import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.repositories.TestEmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private CRUDRepository<Employee> repository = new TestEmployeeRepository();

    @GetMapping("/all")
    public String allEmployees(Model m){
        m.addAllAttributes(repository.getAll());
        return "employees";
    }

}
