package com.example.demo.controllers;

import com.example.demo.utility.DatabaseConnectionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    DatabaseConnectionManager db;

    @GetMapping("/")
    public String index(){
        return "hi" + db.getUrl();
    }
}
