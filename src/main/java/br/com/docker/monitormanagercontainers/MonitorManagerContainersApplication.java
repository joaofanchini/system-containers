package br.com.docker.monitormanagercontainers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MonitorManagerContainersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitorManagerContainersApplication.class, args);
	}

}
