package br.com.docker.monitormanagercontainers.clients.dtos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContainersDTO {
    @JsonAlias({"Id","id"})
    private String id;
    @JsonAlias({"Names","names"})
    private List<String> names;
}
