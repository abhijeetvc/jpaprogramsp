package com.jpa.jpaprogramsp.controller;

import com.jpa.jpaprogramsp.model.Department;
import com.jpa.jpaprogramsp.repository.DepartmentRepository;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping(value="/savedept")
    public String saveDept(@RequestBody Department department){
        departmentRepository.save(department);
        return "Dept saved";
    }
}
