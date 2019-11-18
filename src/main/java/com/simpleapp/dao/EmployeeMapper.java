package com.simpleapp.dao;

import com.simpleapp.dto.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<Employee> {

    public Employee mapRow(ResultSet resultSet, int i) throws SQLException{
        Employee employee = new Employee();
        employee.setEmployeeId(resultSet.getLong("employee_id"));
        employee.setFirstName(resultSet.getString("first_name"));
        employee.setLastName(resultSet.getString("last_name"));
        employee.setDepartmentId(resultSet.getLong("department_id"));
        employee.setJobTitle(resultSet.getString("job_title"));
        employee.setGender(resultSet.getString("gender"));
        employee.setDateOfBirth(resultSet.getDate("date_of_birth"));

        return employee;
    }
}
