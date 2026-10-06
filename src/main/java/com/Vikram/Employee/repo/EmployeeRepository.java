package com.Vikram.Employee.repo;

import com.Vikram.Employee.model_Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Employee findByFname(String fname);
}
