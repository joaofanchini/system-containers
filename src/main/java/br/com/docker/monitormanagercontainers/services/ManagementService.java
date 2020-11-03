package br.com.docker.monitormanagercontainers.services;

import br.com.docker.monitormanagercontainers.clients.DockerEngineApiClient;
import br.com.docker.monitormanagercontainers.clients.dtos.ContainersDTO;
import br.com.docker.monitormanagercontainers.clients.dtos.ImagesDTO;
import br.com.docker.monitormanagercontainers.data.models.Container;
import br.com.docker.monitormanagercontainers.data.models.Image;
import br.com.docker.monitormanagercontainers.dto.response.ContainerResponseDTO;
import br.com.docker.monitormanagercontainers.dto.response.ImagesResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ManagementService {

    // localhost:2375 -> Docker api engine
    private final DockerEngineApiClient dockerEngineApiClient;

    public List<ContainerResponseDTO> getContainers(){
        List<ContainersDTO> containers = dockerEngineApiClient.getContainers();

        return containers.stream().map(containerDTO -> new ContainerResponseDTO(containerDTO.getId(), containerDTO.getNames().stream().findFirst().orElse(null))).collect(Collectors.toList());
    }

    public List<ImagesResponseDTO> getImages(){
        List<ImagesDTO> images = dockerEngineApiClient.getImages();

        return images.stream().map(imageDTO -> new ImagesResponseDTO(imageDTO.getId(), imageDTO.getRepoTags().stream().findAny().orElse(null))).collect(Collectors.toList());
    }

    public void deleteImage(String id) {
        dockerEngineApiClient.deleteImage(id, true);
    }

    public void deleteContainer(String id) {
        dockerEngineApiClient.deleteContainer(id, true);
    }
}
