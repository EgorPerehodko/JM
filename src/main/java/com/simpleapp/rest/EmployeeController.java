package com.simpleapp.rest;

import com.simpleapp.dto.Employee;
import com.simpleapp.service.EmployeeService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getById(@PathVariable("id") Long id) {
        return employeeService.getById(id);
    }

    @PostMapping("/addEmployee")
    public ResponseEntity<Void> addEmployee(@RequestBody Employee employee) {
        employeeService.add(employee);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @PostMapping("/updateEmployee")
    public ResponseEntity<Void> updateEmployee(@RequestBody Employee employee) {
        employeeService.update(employee);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.ACCEPTED);

    }

    @PostMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable("id") Long id){
        employeeService.delete(id);
    }
}