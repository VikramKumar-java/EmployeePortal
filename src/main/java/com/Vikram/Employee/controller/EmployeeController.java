package com.Vikram.Employee.controller;

import com.Vikram.Employee.model_Entity.Employee;
import com.Vikram.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/e1")
    Employee createemp(@RequestBody Employee employee){

        return employeeService.createEmployee(employee);
    }
    @GetMapping("/getAllEmp")
    List<Employee> getAllEmployees(){
        List<Employee> empList = new ArrayList<>();
        empList = employeeService.getAllEmployees();

      return empList;
    }
@GetMapping("/getEmpId/{eid}")
    Employee getEmployeeId(@PathVariable("eid") Integer eid){
        return employeeService.getEmployeebyID(eid);
    }
    @GetMapping("/getempfname/{fname}")
    Employee getEmpByName(@PathVariable("fname") String fname) {
        return employeeService.getEmpByName(fname);
    }

    @PutMapping("/update/{eid}")
    Employee updateEmp(@RequestBody Employee employee,@PathVariable("eid") Integer eid){
        return employeeService.updateEmpId(employee,eid);
    }
@DeleteMapping("/delete/{eid}")
    String deleteEmployeeId(@PathVariable("eid") Integer eid){
        employeeService.deleteEmpId(eid);
        return "employee deleted successfully!!!!";
    }

}
