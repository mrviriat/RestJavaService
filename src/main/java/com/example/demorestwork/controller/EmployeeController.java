package com.example.demorestwork.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demorestwork.service.EmployeeService;

@RestController
@RequestMapping("/salaries")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/departmentID={departmentId}")
    public BaseResponse getDepartmentSalaries(@PathVariable int departmentId) {
        Double maxDepartmentSalary = employeeService.getDepartmentMaxSalary(departmentId);
        Double minDepartmentSalary = employeeService.getDepartmentMinSalary(departmentId);
        Double avgDepartmentSalary = employeeService.getDepartmentAvgSalary(departmentId);

        return new BaseResponse(maxDepartmentSalary, minDepartmentSalary, avgDepartmentSalary);
    }

    @GetMapping
    public BaseResponse getAllSalaries() {
        Double maxSalary = employeeService.getTotalMaxSalary();
        Double minSalary = employeeService.getTotalMinSalary();
        Double avgSalary = employeeService.getTotalAvgSalary();

        return new BaseResponse(maxSalary, minSalary, avgSalary);
    }
}