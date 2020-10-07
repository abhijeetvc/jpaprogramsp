package com.jpa.jpaprogramsp.repository;

import com.jpa.jpaprogramsp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
