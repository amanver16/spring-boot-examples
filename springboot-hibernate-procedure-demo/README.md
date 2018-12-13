# Spring Boot Hibernate Procedure Demo

Spring Boot provides handy annotations and classes to call stored procedures using Spring Data JPA.

## Technologu Used

* Java v1.8
* Maven v3.5
* SpringBoot v2.0.4.RELEASE
* MSSQL Server

## How To Run

* Modify database credentials and connection properties in **src/main/resources/application.properties** file.
* Create required tables and stored procedures. See **src/main/resources/user.sql** file.
* Run the Spring Boot Application using main class **UserApp.java**.
* Test the application using provided server endpoints.

### Server Endpoints

**GET :** localhost:8080/users/getUsers