package com.example.springjpa.controller;

import com.example.springjpa.entity.Department;
import com.example.springjpa.entity.Employee;
import com.example.springjpa.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService ;
    @GetMapping("/{id}")
    public Department findById(@PathVariable("id") Long id){
        return departmentService.findById(id);
    }

    @PostMapping(path = "/reg")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @PutMapping()
    public Department updateDepartment(@RequestBody Department department){
        return departmentService.updateDepartment(department);
    }
}
