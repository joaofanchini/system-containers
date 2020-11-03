package br.com.docker.monitormanagercontainers.controllers;

import br.com.docker.monitormanagercontainers.services.MonitoringService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/monitoring")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MonitoringController {
    private final MonitoringService monitoringService;
    @GetMapping
    public ModelAndView getManagement(){
        return new ModelAndView("/monitoring/index");
    }

    @GetMapping("stats/{id-container}")
    public ResponseEntity<?> getContainerStats(@PathVariable("id-container") String id){
        return ResponseEntity.ok(monitoringService.getContainerStats(id));
    }
}
