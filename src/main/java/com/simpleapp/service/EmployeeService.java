package com.simpleapp.service;

import com.simpleapp.dao.EmployeeDao;
import com.simpleapp.dto.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeDao employeeDao;

    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void add(Employee employee) {
        employeeDao.add(employee);
    }

    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    public Employee getById(Long id) {
        return employeeDao.getById(id);
    }

    public Employee update(Employee employee) {
        employeeDao.update(employee);
        return employee;
    }

    public void delete(Long id) {
        employeeDao.delete(id);
    }
}
