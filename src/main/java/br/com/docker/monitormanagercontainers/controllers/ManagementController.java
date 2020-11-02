package br.com.docker.monitormanagercontainers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/management")
public class ManagementController {

    @GetMapping
    public ModelAndView getManagement(){
        ModelAndView modelAndView = new ModelAndView("/management/index");
        return modelAndView;
    }
}
