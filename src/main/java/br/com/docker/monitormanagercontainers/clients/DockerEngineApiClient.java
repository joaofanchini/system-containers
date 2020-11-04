package br.com.docker.monitormanagercontainers.clients;

import br.com.docker.monitormanagercontainers.clients.dtos.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "dockerEngineApiFeignClient",value = "dockerEngineApiFeignClient",url="${endpoints.docker-engine-api.base-url}")
public interface DockerEngineApiClient {
    @GetMapping("/containers/json")
    List<ContainersDTO> getContainers();

    @PostMapping("/containers/create")
    CreateContainerResponseDTO createContainer(@RequestParam("name") String nameImage, @RequestBody CreateContainerDTO createContainerDTO);

    @PostMapping("/containers/{id}/start")
    void startContainer(@PathVariable("id") String id );

    @DeleteMapping("containers/{id}")
    void deleteContainer(@PathVariable("id") String id, @RequestParam(value = "force", defaultValue = "true") boolean force);

    @GetMapping("/containers/{id}/stats")
    ContainerStatsDTO getContainerStats(@PathVariable("id") String id, @RequestParam("stream") Integer stats);

    @GetMapping("/images/json")
    List<ImagesDTO> getImages();

    @DeleteMapping("images/{id}")
    void deleteImage(@PathVariable("id") String id, @RequestParam(value = "force", defaultValue = "true") boolean force);
}
