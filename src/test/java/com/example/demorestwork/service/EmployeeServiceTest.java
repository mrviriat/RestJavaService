package com.example.demorestwork.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    void testGetDepartmentMaxSalary() {
        Double maxSalary = employeeService.getDepartmentMaxSalary(1);
        assertEquals(700.0, maxSalary);
    }

    @Test
    void testGetDepartmentMinSalary() {
        Double minSalary = employeeService.getDepartmentMinSalary(2);
        assertEquals(50.0, minSalary);
    }

    @Test
    void testGetDepartmentAvgSalary() {
        Double avgSalary = employeeService.getDepartmentAvgSalary(3);
        assertEquals(555.2, avgSalary);
    }

    @Test
    void testGetTotalMaxSalary() {
        Double maxSalary = employeeService.getTotalMaxSalary();
        assertEquals(936.0, maxSalary);
    }

    @Test
    void testGetTotalMinSalary() {
        Double minSalary = employeeService.getTotalMinSalary();
        assertEquals(50.0, minSalary);
    }

    @Test
    void testGetTotalAvgSalary() {
        Double avgSalary = employeeService.getTotalAvgSalary();
        assertEquals(520.67, avgSalary);
    }
}