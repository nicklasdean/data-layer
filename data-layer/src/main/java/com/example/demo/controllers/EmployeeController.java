package com.example.demo.controllers;

import com.example.demo.repositories.DepartmentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    DepartmentRepository departments = new DepartmentRepository();

    @GetMapping("/all")
    public String allEmployees(Model m){
        m.addAllAttributes(departments.getAllDepartments());
        return "employees";
    }
}
