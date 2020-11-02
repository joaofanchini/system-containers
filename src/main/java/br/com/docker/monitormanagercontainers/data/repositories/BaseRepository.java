package br.com.docker.monitormanagercontainers.data.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository <MODEL, ID_TYPE> extends MongoRepository<MODEL,ID_TYPE> {
}
