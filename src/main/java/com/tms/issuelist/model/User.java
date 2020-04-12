package com.tms.issuelist.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User {
    private Long id;

    @NotBlank
    private String userName;

    @NotBlank
    private String passWord;

    @NotBlank
    private String confirmPassWord;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDay;

    @NotBlank
    private String emailAddress;
}
