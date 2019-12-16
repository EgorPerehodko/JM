package com.simpleapp.service;

import com.simpleapp.Exceptions.NoSuchIdException;
import com.simpleapp.rep.EmployeeRepository;
import com.simpleapp.entity.Employee;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void add(Employee employee) {
        employeeRepository.save(employee);
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @SneakyThrows
    public Employee findById(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new NoSuchIdException(id, "show"));
    }

    @SneakyThrows
    public Employee update(Employee employee) {
        try {
            employeeRepository.findById(employee.getEmployeeId()).orElseThrow(() -> new NoSuchIdException(employee.getEmployeeId(), "show"));
        } catch (NoSuchIdException e) {
            e.printStackTrace();
            throw new NoSuchIdException(employee.getEmployeeId(), "update");
        }
        return employeeRepository.save(employee);
    }

    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }
}
