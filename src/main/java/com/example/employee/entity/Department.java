package com.example.employee.entity;

import javax.persistence.*;

@Entity
public class Department {
    @Id
    @SequenceGenerator( name= "department_sequence",
      sequenceName= "department_sequence",
      allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "department_id",
       nullable=false, updatable = false) // making id column nonnull and nonupdateable column
    private Long departmentId;

    @Column(name ="department_name",
    columnDefinition = "TEXT")   // converting varchar into text format in database
    private String departmentName;

    public Department() {
    }

    public Department(Long departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
