package com.example.demorestwork.dao;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class EmployeeDAO {

    @Autowired
    private DataSource dataSource;

    public String getDepartmentMaxSalary(int departmentId) {
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement selectStatement = connection.prepareStatement(
                    "SELECT MAX(salary) FROM employee WHERE department_id = ?");

            selectStatement.setInt(1, departmentId);

            ResultSet resultSet = selectStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getString(1);
            } else {
                return "Записи не найдены";
            }
        } catch (SQLException e) {
            return "Ошибка запроса к базе данных";
        }
    }

    public String getDepartmentMinSalary(int departmentId) {
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement selectStatement = connection.prepareStatement(
                    "SELECT MIN(salary) FROM employee WHERE department_id = ?");

            selectStatement.setInt(1, departmentId);

            ResultSet resultSet = selectStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getString(1);
            } else {
                return "Записи не найдены";
            }
        } catch (SQLException e) {
            return "Ошибка запроса к базе данных";
        }
    }

    public String getDepartmentAvgSalary(int departmentId) {
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement selectStatement = connection.prepareStatement(
                    "SELECT ROUND(AVG(salary), 2) FROM employee WHERE department_id = ?");

            selectStatement.setInt(1, departmentId);

            ResultSet resultSet = selectStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getString(1);
            } else {
                return "Записи не найдены";
            }
        } catch (SQLException e) {
            return "Ошибка запроса к базе данных";
        }
    }

    public String getTotalMaxSalary() {
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement selectStatement = connection.prepareStatement(
                    "SELECT MAX(salary) FROM employee");

            ResultSet resultSet = selectStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getString(1);
            } else {
                return "Записи не найдены";
            }
        } catch (SQLException e) {
            return "Ошибка запроса к базе данных";
        }
    }

    public String getTotalMinSalary() {
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement selectStatement = connection.prepareStatement(
                    "SELECT MIN(salary) FROM employee");

            ResultSet resultSet = selectStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getString(1);
            } else {
                return "Записи не найдены";
            }
        } catch (SQLException e) {
            return "Ошибка запроса к базе данных";
        }
    }

    public String getTotalAvgSalary() {
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement selectStatement = connection.prepareStatement(
                    "SELECT ROUND(AVG(salary), 2) FROM employee");

            ResultSet resultSet = selectStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getString(1);
            } else {
                return "Записи не найдены";
            }
        } catch (SQLException e) {
            return "Ошибка запроса к базе данных";
        }
    }
}