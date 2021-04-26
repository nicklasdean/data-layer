package com.example.demo.repositories;

import com.example.demo.models.Department;
import com.example.demo.models.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private String dbString = "jdbc:mysql://localhost:3306/my_company";
    private String username = "dean";
    private String password = "securePassword";

    public List<Employee> getAllEmployees(){
        List<Employee> allEmployees = new ArrayList<Employee>();
        try {
            Connection conn = DriverManager.getConnection(dbString,username,password);
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM departments");
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

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(allEmployees.size());
        return allEmployees;
    }
}
