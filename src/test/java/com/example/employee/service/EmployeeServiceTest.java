package com.example.employee.service;

import com.example.employee.dao.EmployeeRepo;
import com.example.employee.entity.Department;
import com.example.employee.entity.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {
    @Mock
    private EmployeeRepo employeeRepo;

    @InjectMocks
    private  EmployeeService employeeService;

    @Test
    public void testGetEmployeeById(){
        when(employeeRepo.findById(1L)).
                thenReturn(java.util.Optional.of(new Employee(1L, "Raju", "Developer", "45000", new Department(1L,"FS"))));

        Optional<Employee> emp=employeeService.getEmployeeById(1L);

        Assertions.assertNotNull(emp);

    }

    @Test
    public void testGetEmployeesByDepartment(){
        List<Employee> list=new ArrayList<Employee>();
        List<Employee> list1=new ArrayList<Employee>();

        list.add(new Employee(1L, "Raju", "Developer", "45000", new Department(1L,"FS")));
        list1.add(new Employee(2L, "Ramesh", "Developer", "65000", new Department(2L,"Ecom")));
        list.add(new Employee(3L, "Rani", "Tester", "45000", new Department(1L,"FS")));
        list1.add(new Employee(4L, "Rakesh", "Tester", "85000", new Department(2L,"Ecom")));

        Department dp= new Department(1L,"FS");
        when(employeeRepo.findByDepartment(dp)).thenReturn(list);

        Assertions.assertEquals(2,employeeService.getEmployeesByDepartment(dp).size());
    }

    @Test()
    public void TestRetry() throws ArithmeticException{
        //when(employeeService.retry()).thenThrow(ArithmeticException.class);
        Assertions.assertThrows(ArithmeticException.class,()->employeeService.retry());
        Assertions.assertThrows(Exception.class,()->employeeService.recover(new Exception()));
    }

}
