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
    public Employee update(Long id, Employee employee) {

        return employeeRepository.findById(id).map(empl -> {
                    empl.setFirstName(employee.getFirstName());
                    empl.setLastName(employee.getLastName());
                    empl.setDepartmentId(employee.getDepartmentId());
                    empl.setJobTitle(employee.getJobTitle());
                    empl.setGender(employee.getGender());
                    empl.setDateOfBirth(employee.getDateOfBirth());
                    return employeeRepository.save(empl);
                })
                .orElseThrow(() ->
                    new NoSuchIdException(id, "update")
                );
    }

    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }
}
