package br.com.docker.monitormanagercontainers.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImagesResponseDTO {
    private String id;
    private String repoTag;
}
