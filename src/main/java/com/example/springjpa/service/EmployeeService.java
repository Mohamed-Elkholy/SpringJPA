package com.example.springjpa.service;

import com.example.springjpa.entity.Department;
import com.example.springjpa.entity.Employee;
import com.example.springjpa.repository.DepartmentRepo;
import com.example.springjpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository ;
    @Autowired
    private DepartmentRepo departmentRepo ;

    public Employee findById(Long id) {
        return employeeRepository.findById(id).orElseThrow();
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
        //System.out.println(departmentRepo.findById(emp));

    }

    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }

    public List<Employee> getAllEmployeeByDepartmentId(Long id) {
        return employeeRepository.findAllByDepartmentId(id);
    }

//    public List<Employee> filter(String name) {
//        return employeeRepository.filter(name);
//    }
//
//    public Employee updateEmployee(Employee employee) {
//        Employee current = employeeRepository.findById(employee.getId()).orElseThrow();
//        current.setName(employee.getName());
//        current.setSalary(employee.getSalary());
//        return employeeRepository.save(current);
//    }

}
