package br.com.docker.monitormanagercontainers.data.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "COL_CONTAINER", language = "english")
public class Container {
    @Id
    private String id;
}
