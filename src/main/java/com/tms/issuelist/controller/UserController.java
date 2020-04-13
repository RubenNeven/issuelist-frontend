package com.tms.issuelist.controller;

import com.tms.issuelist.model.SecurityUser;
import com.tms.issuelist.model.User;
import com.tms.issuelist.service.UserFeignClient;
import com.tms.issuelist.service.mapper.SecurityUserMapper;
import com.tms.issuelist.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
@RequestMapping()
public class UserController {

    private final UserFeignClient userFeignClient;
    private final UserMapper mapper;
    private final SecurityUserMapper securityUserMapper;


    @Autowired
    public UserController(UserFeignClient userFeignClient, UserMapper mapper, SecurityUserMapper securityUserMapper) {
        this.userFeignClient = userFeignClient;
        this.mapper = mapper;
        this.securityUserMapper = securityUserMapper;
    }

    @GetMapping()
    public String displayLoginPage(@ModelAttribute("loginForm") User user) {
        return "login";
    }

    @PostMapping()
    public String handleLogin(@Valid @ModelAttribute("loginForm") SecurityUser securityUser, BindingResult br){
        if (br.hasErrors()) {
            for (String code : br.getFieldError().getCodes()){
                System.out.println(code);
            }
            return "loginForm";
        }
        userFeignClient.loginUser(securityUserMapper.map(securityUser));
        return "test";
    }

    @GetMapping("/register")
    public String displayRegisterForm(@ModelAttribute("userForm") User user) {
        return "addUser";
    }

    @PostMapping("/register")
    public String registerUser(@Valid @ModelAttribute("userForm") User user, BindingResult br) {
        if (br.hasErrors()) {
            for (String code : br.getFieldError().getCodes()) {
                System.out.println(code);
            }
            return "addUser";
        }
        userFeignClient.addUser(mapper.map(user));
        return "redirect:/register";
    }
}
