package com.simpleapp.rest;

import com.simpleapp.entity.Employee;
import com.simpleapp.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {

    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Employee getById(@PathVariable("id") Long id) {
        return employeeService.findById(id);
    }

    @PostMapping("/addEmployee")
    @ResponseStatus(HttpStatus.CREATED)
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.add(employee);
    }

    @PostMapping("/updateEmployee/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {
        employeeService.update(id, employee);
    }

    @PostMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployee(@PathVariable("id") Long id) {
            employeeService.delete(id);
    }
}