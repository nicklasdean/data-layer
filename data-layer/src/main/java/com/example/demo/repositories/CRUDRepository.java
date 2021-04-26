package com.example.demo.repositories;

import java.sql.SQLException;
import java.util.List;

public interface CRUDRepository<T> {
    public List<T> getAll();
}
