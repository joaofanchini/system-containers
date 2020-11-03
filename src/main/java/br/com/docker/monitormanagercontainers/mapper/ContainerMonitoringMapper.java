package br.com.docker.monitormanagercontainers.mapper;

import br.com.docker.monitormanagercontainers.clients.dtos.ContainerStatsDTO;
import br.com.docker.monitormanagercontainers.data.models.ContainerMonitoringData;
import org.springframework.stereotype.Service;

@Service
public class ContainerMonitoringMapper {

    public ContainerMonitoringData fromContainerStatsDTO(ContainerStatsDTO containerStatsDTO, String idContainer){
        ContainerMonitoringData containerMonitoringData = new ContainerMonitoringData();
        containerMonitoringData.setIdContainer(idContainer);
        containerMonitoringData.setCpuStats(containerStatsDTO.getCpuStats());
        containerMonitoringData.setMemoryStats(containerStatsDTO.getMemoryStats());

        return containerMonitoringData;
    }

}
