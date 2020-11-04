package br.com.docker.monitormanagercontainers.clients.dtos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContainerStatsDTO {
    @JsonAlias({"cpuStats","cpu_stats"})
    private CpuStats cpuStats;
    @JsonAlias({"memoryStats","memory_stats"})
    private MemoryStats memoryStats;

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
        private CpuUsage cpuUsage;
        @JsonAlias({"systemCpuUsage","system_cpu_usage"})
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
            @JsonAlias({"userInUserMode","usage_in_usermode"})
            private String usageInUserMode;
        }
    }
}
