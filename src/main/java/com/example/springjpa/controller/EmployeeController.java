package com.example.springjpa.controller;

import com.example.springjpa.entity.Department;
import com.example.springjpa.entity.Employee;
import com.example.springjpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/all")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }

    @GetMapping("/department/{id}")
    public List<Employee> getAllEmployeeByDepartmentId(@PathVariable("id") Long id){
        return employeeService.getAllEmployeeByDepartmentId(id);
    }
//    @GetMapping()
//    public List<Employee> findByName(@RequestParam("name") String name){
//        return employeeService.filter(name);
//    }
//
//    @PutMapping()
//    public Employee updateEmployee(@RequestBody Employee employee){
//        return employeeService.updateEmployee(employee);
//    }
}
