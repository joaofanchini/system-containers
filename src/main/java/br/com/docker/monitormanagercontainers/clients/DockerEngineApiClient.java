package br.com.docker.monitormanagercontainers.clients;

import br.com.docker.monitormanagercontainers.clients.dtos.ContainerStatsDTO;
import br.com.docker.monitormanagercontainers.clients.dtos.ContainersDTO;
import br.com.docker.monitormanagercontainers.clients.dtos.ImagesDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "dockerEngineApiFeignClient",value = "dockerEngineApiFeignClient",url="${endpoints.docker-engine-api.base-url}")
public interface DockerEngineApiClient {
    @GetMapping("/containers/json")
    List<ContainersDTO> getContainers();

    @DeleteMapping("containers/{id}")
    void deleteContainer(@PathVariable("id") String id, @RequestParam(value = "force", defaultValue = "true") boolean force);

    @GetMapping("/containers/{id}/stats")
    ContainerStatsDTO getContainerStats(@PathVariable("id") String id);

    @GetMapping("/images/json")
    List<ImagesDTO> getImages();

    @DeleteMapping("images/{id}")
    void deleteImage(@PathVariable("id") String id, @RequestParam(value = "force", defaultValue = "true") boolean force);
}
