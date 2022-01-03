package com.example.employee.service;

import com.example.employee.dao.EmployeeRepo;
import com.example.employee.entity.Department;
import com.example.employee.entity.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    public Optional<Employee> getEmployeeById(Long id) {
        log.info("implementing getEmployeeById method in employeeService");
        return repo.findById(id);
    }


    public List<Employee> getEmployeesByDepartment(Department department) {
        log.info("implementing getEmployeesByDepartment method in employeeService");
        return repo.findByDepartment(department);
    }


    @Retryable(value = {ArithmeticException.class}, maxAttempts = 3, backoff = @Backoff(200))
    public String retry() throws ArithmeticException{
        throw new ArithmeticException();
    }
    @Recover
    public String recover(Exception exp) throws Exception {
        log.info("Default Retry servive test");
        throw new Exception();
    }
}
