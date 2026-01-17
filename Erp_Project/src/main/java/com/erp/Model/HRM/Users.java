package com.erp.Model.HRM;

import com.erp.Common.Enum.WorkingStatus;
import jakarta.persistence.*;
import lombok.*;

import java.awt.*;
import java.sql.Date;

@Entity
@Table(name = "users")
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Id
    private String id;

    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "identification", nullable = false)
    private String identification;
    @Column(name = "date_of_birth", nullable = false)
    private Date dateOfBirth;
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
    @Column(name = "start_date", nullable = false)
    private Date startDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private WorkingStatus status;

    @OneToOne(mappedBy = "user")
    private Account account;

}
