package br.com.docker.monitormanagercontainers.clients.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImagesDTO {
    @JsonAlias({"id","Id"})
    private String id;
    @JsonAlias({"repoTags","RepoTags"})
    private List<String> repoTags;
}
