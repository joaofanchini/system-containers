# Read Me First
The following was discovered as part of building this project:

* The original package name 'br.com.docker.monitor-manager-containers' is invalid and this project uses 'br.com.docker.monitormanagercontainers' instead.

# Getting Started

## Configuration

* Open the `application.yml` file and indicate the settings about the Docker Engine API and the connection to MongoDB
* Required to have `java 11` and `maven` configured in your environment

## Run

* Start the MongoDB database service that was indicated for the application in the configuration file.
* Go to the project's root folder and use the command `mvn -DskipTests spring-boot:run`

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/reference/htmlsingle/#using-boot-devtools)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

