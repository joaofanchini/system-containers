package br.com.docker.monitormanagercontainers.controllers;

import br.com.docker.monitormanagercontainers.clients.dtos.CreateContainerDTO;
import br.com.docker.monitormanagercontainers.dto.response.ContainerResponseDTO;
import br.com.docker.monitormanagercontainers.dto.response.ImagesResponseDTO;
import br.com.docker.monitormanagercontainers.services.ManagementService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/management")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ManagementController {

    private final ManagementService managementService;

    @GetMapping
    public ModelAndView getManagement(){
        return new ModelAndView("/management/index");
    }

    @GetMapping("/containers")
    public ResponseEntity<List<ContainerResponseDTO>> getContainers(){
       return ResponseEntity.ok(managementService.getContainers());
    }

    @GetMapping("/images")
    public ResponseEntity<List<ImagesResponseDTO>> getImages(){
        return ResponseEntity.ok(managementService.getImages());
    }

    @PostMapping("/create-container")
    public ResponseEntity createContainer(@RequestBody CreateContainerDTO createContainerDTO,
                                          @RequestParam("name-image") String nameImage){
        managementService.createContainer(nameImage, createContainerDTO);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/images/{id-image}")
    public ResponseEntity deleteImage(@PathVariable("id-image") String id){
        managementService.deleteImage(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/containers/{id-container}")
    public ResponseEntity deleteContainer(@PathVariable("id-container") String id){
        managementService.deleteContainer(id);
        return ResponseEntity.noContent().build();
    }
}
