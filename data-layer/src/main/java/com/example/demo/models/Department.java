package com.example.demo.models;

public class Department {
    private int departmentNumber;
    private String departmentsName;
    private String location;

    public Department(int departmentNumber, String departmentsName, String location) {
        this.departmentNumber = departmentNumber;
        this.departmentsName = departmentsName;
        this.location = location;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getDepartmentsName() {
        return departmentsName;
    }

    public void setDepartmentsName(String departmentsName) {
        this.departmentsName = departmentsName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
