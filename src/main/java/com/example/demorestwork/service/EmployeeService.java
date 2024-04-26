package com.example.demorestwork.service;

import com.example.demorestwork.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeService(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public Double getDepartmentMaxSalary(int departmentId) {
        return employeeDAO.findMaxSalaryByDepartmentId(departmentId);
    }

    public Double getDepartmentMinSalary(int departmentId) {
        return employeeDAO.findMinSalaryByDepartmentId(departmentId);
    }

    public Double getDepartmentAvgSalary(int departmentId) {
        return employeeDAO.findAvgSalaryByDepartmentId(departmentId);
    }

    public Double getTotalMaxSalary() {
        return employeeDAO.findTotalMaxSalary();
    }

    public Double getTotalMinSalary() {
        return employeeDAO.findTotalMinSalary();
    }

    public Double getTotalAvgSalary() {
        return employeeDAO.findTotalAvgSalary();
    }
}