package com.tms.issuelist.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "users")
@ToString
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "userName")
    private String userName;

    @Column(name = "passWord")
    private String passWord;

    @Column(name = "birthDay")
    private LocalDate birthDay;

    @Column(name = "email")
    private String emailAddress;
}
