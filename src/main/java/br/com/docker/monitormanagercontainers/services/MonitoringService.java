package br.com.docker.monitormanagercontainers.services;

import br.com.docker.monitormanagercontainers.clients.DockerEngineApiClient;
import br.com.docker.monitormanagercontainers.clients.dtos.ContainerStatsDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MonitoringService {
    private final DockerEngineApiClient dockerEngineApiClient;

    public ContainerStatsDTO getContainerStats(String id){
        return dockerEngineApiClient.getContainerStats(id);
    }
}
