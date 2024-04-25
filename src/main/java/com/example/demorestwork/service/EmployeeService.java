package com.example.demorestwork.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demorestwork.dao.EmployeeDAO;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    public String getDepartmentMaxSalary(int departmentId) {
        return employeeDAO.getDepartmentMaxSalary(departmentId);
    }
    public String getDepartmentMinSalary(int departmentId) {
        return employeeDAO.getDepartmentMinSalary(departmentId);
    }

    public String getDepartmentAvgSalary(int departmentId) {
        return employeeDAO.getDepartmentAvgSalary(departmentId);
    }

    public String getTotalMaxSalary() {
        return employeeDAO.getTotalMaxSalary();
    }

    public String getTotalMinSalary() {
        return employeeDAO.getTotalMinSalary();
    }

    public String getTotalAvgSalary() {
        return employeeDAO.getTotalAvgSalary();
    }
}