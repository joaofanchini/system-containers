package br.com.docker.monitormanagercontainers.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContainerResponseDTO {
    private String id;
    private String name;
}
