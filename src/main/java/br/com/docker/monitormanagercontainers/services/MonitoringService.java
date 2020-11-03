package br.com.docker.monitormanagercontainers.services;

import br.com.docker.monitormanagercontainers.clients.DockerEngineApiClient;
import br.com.docker.monitormanagercontainers.clients.dtos.ContainerStatsDTO;
import br.com.docker.monitormanagercontainers.data.repositories.ContainerRepository;
import br.com.docker.monitormanagercontainers.mapper.ContainerMonitoringMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MonitoringService {

    private static final Integer STATS_INTERNAL = 0;

    private final DockerEngineApiClient dockerEngineApiClient;
    private final ContainerRepository containerRepository;
    private final ContainerMonitoringMapper containerMonitoringMapper;

    @Transactional
    public ContainerStatsDTO getContainerStats(String id){

        ContainerStatsDTO containerStats = dockerEngineApiClient.getContainerStats(id, STATS_INTERNAL);
        containerRepository.save(containerMonitoringMapper.fromContainerStatsDTO(containerStats, id));

        return containerStats;
    }
}
