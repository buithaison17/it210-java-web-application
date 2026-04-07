package org.example.bai5.model;

import java.util.Date;

public class Employee {
    private String id;
    private String fullName;
    private String department;
    private double salary;
    private Date date;
    private String status;

    public Employee(String id, String fullName, String department, double salary, Date date, String status) {
        this.id = id;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.date = date;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
