package com.example.demo.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnectionManager {
    @Autowired
    private Environment env;

    @Value("${jdbc.url}")
    private String url;

    public String getUrl(){
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
