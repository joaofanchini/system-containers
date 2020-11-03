package br.com.docker.monitormanagercontainers.data.models;

import br.com.docker.monitormanagercontainers.clients.dtos.ContainerStatsDTO;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "COL_CONTAINER_MONITORING_DATA", language = "english")
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContainerMonitoringData {

    @Id
    private String id;
    private String idContainer;

    @JsonAlias({"cpuStats","cpu_stats"})
    private ContainerStatsDTO.CpuStats cpuStats;
    @JsonAlias({"memoryStats","memory_stats"})
    private ContainerStatsDTO.MemoryStats memoryStats;

    @Data
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MemoryStats{
        @JsonAlias("usage")
        private String usage;
        @JsonAlias({"maxUsage","max_usage"})
        private String maxUsage;
    }

    @Data
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CpuStats{
        @JsonAlias({"cpuUsage","cpu_usage"})
        private ContainerStatsDTO.CpuStats.CpuUsage cpuUsage;
        @JsonAlias({"systemCpuUsage","system_cpf_usage"})
        private String systemCpuUsage;
        @JsonAlias({"onlineCpus","online_cpus"})
        private String onlineCpus;

        @Data
        @NoArgsConstructor
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class CpuUsage{
            @JsonAlias({"totalUsage","total_usage"})
            private String totalUsage;
            @JsonAlias({"usageInKernelMode","usage_in_kernelmode"})
            private String usageInKernelMode;
            @JsonAlias({"userInUserMode","user_in_usermode"})
            private String userInUserMode;
        }
    }
}
