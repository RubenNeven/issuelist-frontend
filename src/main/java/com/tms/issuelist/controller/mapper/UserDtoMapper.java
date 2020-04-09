package com.tms.issuelist.controller.mapper;

import com.tms.issuelist.controller.dto.UserDto;
import com.tms.issuelist.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoMapper {

    public UserDto map(User user){
        return UserDto.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .emailAddress(user.getEmailAddress())
                .birthDay(user.getBirthDay())
                .userName(user.getUserName())
                .passWord(user.getPassWord())
                .build();
    }

    public User map(UserDto user) {
        return User.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .emailAddress(user.getEmailAddress())
                .birthDay(user.getBirthDay())
                .userName(user.getUserName())
                .passWord(user.getPassWord())
                .build();
    }
}
