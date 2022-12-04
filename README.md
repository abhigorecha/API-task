# API Task for Airmeet
[![Maven CI](https://github.com/abhigorecha/API-task/actions/workflows/airmeet.yml/badge.svg)](https://github.com/abhigorecha/API-task/actions/workflows/airmeet.yml)

This API is built using
- Coded in **Java 8**
- Developed using **Spring Boot 2.7.6**
- Stored data inside **MariaDB 10.6**
- CI pipelines using **GitHub Actions**
- Packaging using **Docker**
- Development setup using **docker-compose**


## For runnung the server
Provided you have your [**`JAVA_HOME`** setup](https://docs.oracle.com/cd/E19182-01/820-7851/inst_cli_jdk_javahome_t/) and [JDK 8](https://docs.aws.amazon.com/corretto/latest/corretto-8-ug/downloads-list.html) available in your shell you can run
```bash
./mvnw spring-boot:run
```

You should be able to see the server in your `localhost` at port `8080`

Available @ **`http://localhost:8080`**


## API Secifications

The **Swagger UI** is available @ **`http://localhost:8080/swagger-ui.httml`**


## Actuator Endpoints

- Health **`http://localhost:8080/actuator/health`**
- Information **`http://localhost:8080/actuator/info`**
