package com.example.springjpa.service;

import com.example.springjpa.entity.Department;
import com.example.springjpa.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo ;

    public Department findById(Long id) {
        return departmentRepo.findById(id).orElseThrow();
    }

    public Department saveDepartment(Department department) {
        return departmentRepo.save(department);
    }

    public Department updateDepartment(Department department) {
        Department current = departmentRepo.findById(department.getId()).orElseThrow();
        current.setName(department.getName());
        return departmentRepo.save(current);
    }
}
