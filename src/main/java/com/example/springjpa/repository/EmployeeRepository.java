package com.example.springjpa.repository;

import com.example.springjpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value = "select emp from Employee emp where emp.name like :name")
    public List<Employee> filter(@Param("name") String name) ;

    public List<Employee> findAllByDepartmentId(Long id) ;

}
