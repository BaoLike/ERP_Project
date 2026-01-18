package com.erp.Model.HRM;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "position")
public class Position {
    @Id
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "decription")
    private String decription;
}
