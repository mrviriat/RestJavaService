package com.example.demorestwork.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demorestwork.service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/departments/{departmentId}/salaries")
    public BaseResponse getDepartmentSalaries(@PathVariable int departmentId) {
        String maxDepartmentSalary = employeeService.getDepartmentMaxSalary(departmentId);
        String minDepartmentSalary = employeeService.getDepartmentMinSalary(departmentId);
        String avgDepartmentSalary = employeeService.getDepartmentAvgSalary(departmentId);

        return new BaseResponse(maxDepartmentSalary, minDepartmentSalary, avgDepartmentSalary);
    }

    @GetMapping("/salaries")
    public BaseResponse getAllSalaries() {
        String maxSalary = employeeService.getTotalMaxSalary();
        String minSalary = employeeService.getTotalMinSalary();
        String avgSalary = employeeService.getTotalAvgSalary();

        return new BaseResponse(maxSalary, minSalary, avgSalary);
    }
}