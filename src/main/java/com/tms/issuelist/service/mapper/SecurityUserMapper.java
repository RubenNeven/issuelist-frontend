package com.tms.issuelist.service.mapper;

import com.tms.issuelist.controller.dto.SecurityUserDto;
import com.tms.issuelist.model.SecurityUser;
import org.springframework.stereotype.Component;

@Component
public class SecurityUserMapper {

    public SecurityUser map(SecurityUserDto securityDto) {
        return SecurityUser.builder()
                .userName(securityDto.getUserName())
                .passWord(securityDto.getPassWord())
                .build();

    }

    public SecurityUserDto map(SecurityUser securityUser) {
        return SecurityUserDto.builder()
                .userName(securityUser.getUserName())
                .passWord(securityUser.getPassWord())
                .build();
    }
}
