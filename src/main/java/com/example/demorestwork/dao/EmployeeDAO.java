package com.example.demorestwork.dao;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDAO extends CrudRepository<Employee, Integer> {

    @Query("SELECT MAX(salary) FROM employee WHERE department_id = :departmentId")
    Double findMaxSalaryByDepartmentId(Integer departmentId);

    @Query("SELECT MIN(salary) FROM employee WHERE department_id = :departmentId")
    Double findMinSalaryByDepartmentId(Integer departmentId);

    @Query("SELECT ROUND(AVG(salary), 2) FROM employee WHERE department_id = :departmentId")
    Double findAvgSalaryByDepartmentId(Integer departmentId);

    @Query("SELECT MAX(salary) FROM employee")
    Double findTotalMaxSalary();

    @Query("SELECT MIN(salary) FROM employee")
    Double findTotalMinSalary();

    @Query("SELECT ROUND(AVG(salary), 2) FROM employee")
    Double findTotalAvgSalary();
}
