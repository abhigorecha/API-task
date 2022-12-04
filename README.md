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

### [GET]`/users`
Fetch all the users

#### Request Body

```json
[
  {
    "firstName" : "Abhishek",
    "lastName": "Gorecha",
    "accountNumber": "123456789",
    "email": "abhishek@gmail.com",
    "birthDate": "1997-12-23"
  },
  {
    "firstName" : "Neelesh",
    "lastName": "Lakhera",
    "accountNumber": "987654321",
    "email": "neelesh@gmail.com",
    "birthDate": "1997-01-01"
  }
]
```

#### Response Status
- **`200`** OK
- **`500`** Internal Server Error


### [POST]`/users`
Fetch all the users

#### Request Body

```json
{
  "firstName" : "Abhishek",
  "lastName": "Gorecha",
  "accountNumber": "123456789",
  "email": "abhishek@gmail.com",
  "birthDate": "1997-12-23"
}
```

#### Response Body

```json
1
```

#### Response Status
- **`200`** OK
- **`500`** Internal Server Error



### [POST]`/users/{accountNumber}`
Fetch a particular User's data by account number

#### Response Body

```json
{
  "firstName" : "Abhishek",
  "lastName": "Gorecha",
  "accountNumber": "123456789",
  "email": "abhishek@gmail.com",
  "birthDate": "1997-12-23"
}
```

#### Response Status
- **`200`** OK
- **`404`** Not Found
- **`500`** Internal Server Error


The **Swagger UI** is available @ **`http://localhost:8080/swagger-ui.httml`**


## Actuator Endpoints

- Health **`http://localhost:8080/actuator/health`**
- Information **`http://localhost:8080/actuator/info`**
