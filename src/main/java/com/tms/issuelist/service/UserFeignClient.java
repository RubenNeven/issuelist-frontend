package com.tms.issuelist.service;

import com.tms.issuelist.controller.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "userFeignClient", url="${baseURL}/api/users")
public interface UserFeignClient {

    @PostMapping
    void addUser(UserDto userDto);
}
