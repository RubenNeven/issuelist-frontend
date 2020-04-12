package com.tms.issuelist.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SecurityUser {
    @NotBlank
    private String userName;

    @NotBlank
    private String passWord;
}
