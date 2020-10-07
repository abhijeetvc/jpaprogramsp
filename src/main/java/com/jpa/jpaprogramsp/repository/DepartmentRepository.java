package com.jpa.jpaprogramsp.repository;

import com.jpa.jpaprogramsp.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
