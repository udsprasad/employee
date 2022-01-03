package com.example.employee.dao;

import com.example.employee.entity.Department;
import com.example.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
   List<Employee> findByDepartment(Department department);
}
