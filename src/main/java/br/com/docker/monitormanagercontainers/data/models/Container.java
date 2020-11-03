package br.com.docker.monitormanagercontainers.data.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "COL_CONTAINER", language = "english")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Container {
    @Id
    private String id;
    private String name;
}
