package com.guru.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guru.pojo.Employee;

public interface EmpRepo extends JpaRepository<Employee, Long> {

}
