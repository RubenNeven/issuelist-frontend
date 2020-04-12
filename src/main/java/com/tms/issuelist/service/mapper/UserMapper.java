package com.tms.issuelist.service.mapper;

import com.tms.issuelist.controller.dto.UserDto;
import com.tms.issuelist.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User map(UserDto userDto) {
        return User.builder()
                .id(userDto.getId())
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .emailAddress(userDto.getEmailAddress())
                .birthDay(userDto.getBirthDay())
                .userName(userDto.getUserName())
                .passWord(userDto.getPassWord())
                .confirmPassWord(userDto.getConfirmPassWord())
                .build();

    }

    public UserDto map(User user) {
        return UserDto.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .emailAddress(user.getEmailAddress())
                .birthDay(user.getBirthDay())
                .userName(user.getUserName())
                .passWord(user.getPassWord())
                .confirmPassWord(user.getConfirmPassWord())
                .build();
    }
}
