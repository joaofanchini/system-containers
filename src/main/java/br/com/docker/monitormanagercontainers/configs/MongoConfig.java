package br.com.docker.monitormanagercontainers.configs;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import java.util.Collection;
import java.util.Collections;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {

    @Value("${mongodb.host}") String host;
    @Value("${mongodb.port}") String port;
    @Value("${mongodb.database-name}") String databaseName;
    @Value("${mongodb.username}") String username;
    @Value("${mongodb.password}") String password;

    @Override
    protected String getDatabaseName() {
        return databaseName;
    }

    @Override
    public MongoClient mongoClient() {
        ConnectionString connectionStringSetting = new ConnectionString("mongodb://" + username + ":" + password + "@" + host  + ":" + port + "/" + databaseName);
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionStringSetting)
                .build();

        return MongoClients.create(settings);
    }

    @Override
    protected Collection<String> getMappingBasePackages() {
        return Collections.singletonList("br.com.docker.monitormanagercontainers.data");
    }

    @Override
    public MongoDatabaseFactory mongoDbFactory() {
        return super.mongoDbFactory();
    }
}
