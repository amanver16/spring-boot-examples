# Employee Repository REST API Using Spring Boot and Mongo DB

## Technology Used

* Java v1.8
* Maven v3.5
* Spring Boot v2.0.4.RELEASE
* Mongo DB v3.6

## Spring Boot

Spring Boot is a project built on the top of the Spring framework. It provides a simpler and faster way to set up, configure, and run both simple and web-based applications. Before Spring Boot, you need to configure all the dependencies by yourself. Hence, resulting in lot of configuration files, such as XML descriptors. That’s one out of the main problems that Spring Boot solves for you. It smartly chooses the dependencies, auto-configures all the features an application needs, and you can start your application with one click. Furthermore, it also simplifies the deployment process of your application.  

## Mongo DB

MongoDB is a [Cross-platform](https://en.wikipedia.org/wiki/Cross-platform) [Document-oriented Database](https://en.wikipedia.org/wiki/Document-oriented_database) program. It is issued under the [Server Side Public License (SSPL)](https://www.mongodb.com/licensing/server-side-public-license) version 1, which was submitted for OSI certification but later withdrawn in lieu of SSPL version 2. Classified as a **NoSQL** database program, MongoDB uses [JSON](https://en.wikipedia.org/wiki/JSON)-like documents with schemata. MongoDB is developed by [MongoDB Inc](https://en.wikipedia.org/wiki/MongoDB_Inc).
  
![Spring Boot MongoDB](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/SpringBoot%20MongoDB%20Architecture.png)

## How To Run
* Start the MongoDB Server.
* Run the spring boot application using main class **EmployeeApp.java**

## Server Endpoints

* **GET :** localhost:8080/employee/getEmployees