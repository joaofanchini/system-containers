package br.com.docker.monitormanagercontainers.clients.dtos;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateContainerDTO {
    @JsonAlias({"image","imageId"})
    private String image;
}
