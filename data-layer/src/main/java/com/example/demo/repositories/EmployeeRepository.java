package com.example.demo.repositories;

import com.example.demo.models.Department;
import com.example.demo.models.Employee;
import com.example.demo.utility.DatabaseManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements CRUDRepository<Employee>{

    @Override
    public List<Employee> getAll() {
        List<Employee> allEmployees = new ArrayList<Employee>();
        Connection conn = null;
        try {
            conn = DatabaseManager.getConnection();

            conn.setAutoCommit(false);

            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees");

            ResultSet resultSet = pstmt.executeQuery();
            while(resultSet.next()){
                allEmployees.add(new Employee(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getInt(4),
                        resultSet.getDate(5),
                        resultSet.getInt(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8)
                ));
            }
            conn.commit();

        } catch (SQLException e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        System.out.println(allEmployees.size());
        return allEmployees;
    }
}
