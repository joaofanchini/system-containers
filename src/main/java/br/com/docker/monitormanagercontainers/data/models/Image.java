package br.com.docker.monitormanagercontainers.data.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "COL_IMAGE", language = "english")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Image {
    @Id
    private String id;
    private String repoTag;
}
