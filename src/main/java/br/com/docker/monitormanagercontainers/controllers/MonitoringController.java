package br.com.docker.monitormanagercontainers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/monitoring")
public class MonitoringController {
    @GetMapping
    public ModelAndView getManagement(){
        ModelAndView modelAndView = new ModelAndView("/monitoring/index");
        return modelAndView;
    }
}
