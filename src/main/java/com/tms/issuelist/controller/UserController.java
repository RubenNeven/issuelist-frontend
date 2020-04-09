package com.tms.issuelist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class UserController {

    @GetMapping
    public String displayLoginPage(Model model) {
        return "login";
    }

    @GetMapping("/register")
    public String displayRegisterForm(Model model) {
        return "addUser";
    }

}
