package com.erp.Model.HRM;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
    @Id
    private String id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "num_of_employee")
    private Integer numOfEmployee;

}
