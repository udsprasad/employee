package com.example.employee.controller;

import com.example.employee.entity.Department;
import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;


import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeService employeeService;

    @Test
    public void  getEmployeeByIdTest() throws Exception {
        Mockito.when(employeeService.getEmployeeById(Mockito.anyLong())).thenReturn(java.util.Optional.of(new Employee(1L, "Raju", "Developer", "45000", new Department(1L, "FS"))));
        mockMvc.perform(get("/employee/1")).andExpect(status().isOk());
    }

    @Test
    public void getEmployeesByDepartmentTest() throws Exception {
        List<Employee> list=new ArrayList<Employee>();
        Employee emp=new Employee();
        emp.setId(1L);
        Department dep =new Department();
        dep.setDepartmentId(1L);
        dep.setDepartmentName("FS");
        emp.setDepartment(dep);
        emp.setName("Raju");
        emp.setDesignation("Developer");
        emp.setSalary("45000");
        list.add(emp);

        Mockito.when(employeeService.getEmployeesByDepartment(Mockito.any(Department.class))).thenReturn(list);
        ObjectMapper mapper=new ObjectMapper();
        String json = mapper.writeValueAsString(emp);
        mockMvc.perform(post("/employee/getEmployeesByDepartment").accept(MediaType.APPLICATION_JSON).content(json).contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }

}
