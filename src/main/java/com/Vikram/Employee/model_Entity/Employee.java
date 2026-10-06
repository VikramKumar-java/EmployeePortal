package com.Vikram.Employee.model_Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee35")
@Setter
@Getter
public class Employee {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer eid;
    Integer eage;
    String fname;
    String lname;
    String city;
    double salary;

}
