package com.example.demo.repositories;

import com.example.demo.models.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepository {
    private String dbString = "jdbc:mysql://localhost:3306/my_company";
    private String username = "dean";
    private String password = "securePassword";

    public List<Department> getAllDepartments(){
        List<Department> allDepartments = new ArrayList<Department>();
        try {
            Connection conn = DriverManager.getConnection(dbString,username,password);
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM departments");
            ResultSet resultSet = pstmt.executeQuery();

            while(resultSet.next()){
                allDepartments.add(new Department(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3)
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allDepartments;
    }

    public boolean insertDepartment(Department d){
        Department testData = new Department(10, "SoMe Marketing", "Copenhagen");
        return false;
    }
}
