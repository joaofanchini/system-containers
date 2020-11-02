package br.com.docker.monitormanagercontainers.data.repositories;

import br.com.docker.monitormanagercontainers.data.models.Container;
import org.springframework.stereotype.Repository;

@Repository
public interface ContainerRepository extends BaseRepository<Container, String> {
}
