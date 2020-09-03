package com.demo.emp.controller;

import com.demo.emp.domain.dto.UserDto;
import com.demo.emp.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@AllArgsConstructor
public class AdminController {


    private UserServiceImpl userService;

    @GetMapping("/")
    public ModelAndView getAllUser() {
        ModelAndView modelAndView = new ModelAndView("index");
        List<UserDto> users = userService.getAllUser();
        modelAndView.addObject("users", users);
        return modelAndView;
    }

    @GetMapping("/login")
    public ModelAndView initLogin(){
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }
}
