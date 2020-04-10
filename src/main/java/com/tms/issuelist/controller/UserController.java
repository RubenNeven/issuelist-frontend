package com.tms.issuelist.controller;

import com.tms.issuelist.model.User;
import com.tms.issuelist.service.UserFeignClient;
import com.tms.issuelist.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


@Controller
@RequestMapping("/")
public class UserController {

    private final UserFeignClient userFeignClient;
    private final UserMapper mapper;

    @Autowired
    public UserController(UserFeignClient userFeignClient, UserMapper mapper) {
        this.userFeignClient = userFeignClient;
        this.mapper = mapper;
    }

    @GetMapping
    public String displayLoginPage(Model model) {
        return "login";
    }

    @GetMapping("/register")
    public String displayRegisterForm(@ModelAttribute("userForm") User user) {
        return "addUser";
    }

    @PostMapping("/register")
    public String registerUser(@Valid @ModelAttribute("userForm") User user, BindingResult br){
        if (br.hasErrors()) {
            for (String code: br.getFieldError().getCodes()) {
                System.out.println(code);
            }
                return "addUser";
        }
        userFeignClient.addUser(mapper.map(user));
        return "redirect:/";
    }
}
