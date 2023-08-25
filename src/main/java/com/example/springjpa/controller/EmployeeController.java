package com.example.springjpa.controller;

import com.example.springjpa.entity.Employee;
import com.example.springjpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService ;

    @GetMapping(path = "/{id}")
    public Employee findById(@PathVariable Long id){
        return employeeService.findById(id);
    }

    @PostMapping(path = "/reg")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }
    @GetMapping()
    public Employee findByName(@Param("name") String name){
        return employeeService.filter(name);
    }
}
