package com.erp.Model.HRM;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_assignment")
public class EmployeeAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "is_current")
    private boolean isCurrent;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;
}
