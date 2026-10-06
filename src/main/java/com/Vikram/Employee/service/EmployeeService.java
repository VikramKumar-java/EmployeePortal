package com.Vikram.Employee.service;

import com.Vikram.Employee.model_Entity.Employee;
import com.Vikram.Employee.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee getEmployeebyID(Integer eid) {

        return employeeRepository.findById(eid).orElseThrow();
    }

    public Employee createEmployee(Employee employee){

       return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {

       return employeeRepository.findAll();
    }
    public Employee getEmpByName(String fname) {
        return employeeRepository.findByFname(fname);
    }

    public Employee updateEmpId(Employee employee, Integer eid) {
        Employee empDb = getEmployeebyID(eid);
        empDb.setEage(employee.getEage());
        empDb.setCity(employee.getCity());
        empDb.setFname(employee.getFname());
        empDb.setLname(employee.getLname());
        empDb.setSalary(employee.getSalary());
        return employeeRepository.save(empDb);
    }

    public void deleteEmpId(Integer eid) {

        employeeRepository.deleteById(eid);
    }
}
