package com.example.employee.dao;

import com.example.employee.jpa.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface StudentRepo<T extends Student,E extends Serializable> extends JpaRepository<T,E> {
}
