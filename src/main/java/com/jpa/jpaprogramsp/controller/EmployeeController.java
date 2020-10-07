package com.jpa.jpaprogramsp.controller;

import com.jpa.jpaprogramsp.model.Employee;
import com.jpa.jpaprogramsp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//OneToOne
//OneToMany
//ManyToOne
//ManyToMany

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping(value="/save")
    public String saveEmp(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Employee saved";
    }

    @GetMapping(value="/getemplist")
    public List<Employee> getList(){
        return employeeRepository.findAll();
    }

    @GetMapping(value="/getemp/{id}")
    public Optional<Employee> getEmployee(@PathVariable Integer id){

        return employeeRepository.findById(id);
    }
}
