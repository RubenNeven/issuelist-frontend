package com.tms.issuelist.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User {
    private String userName;
    private String passWord;
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private String emailAddress;
}
