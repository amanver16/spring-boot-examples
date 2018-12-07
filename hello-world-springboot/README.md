# Hello World Application in Spring Boot

## Technology Used

* Java v1.8
* Maven v3.5
* Spring Boot v2.0.4.RELEASE

## Spring Boot

Spring Boot is a project built on the top of the Spring framework. It provides a simpler and faster way to set up, configure, and run both simple and web-based applications. Before Spring Boot, you need to configure all the dependencies by yourself. Hence, resulting in lot of configuration files, such as XML descriptors. That’s one out of the main problems that Spring Boot solves for you. It smartly chooses the dependencies, auto-configures all the features an application needs, and you can start your application with one click. Furthermore, it also simplifies the deployment process of your application.  
  
![Spring Boot](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Spring%20Boot%20Modules.png)

## How to Develop First Spring Boot Application

### Generating Spring Boot Project

There are various ways to create a Spring Boot Application.  
* Using Maven
* Using STS (Spring Tool Suite)
* Using Spring Initializer
* Using Spring Boot CLI  

**Using Maven :**
1. Generate a Maven Project using any IDE using simple archetype selection.
2. Add following to the **pom.xml**  

```xml
<parent>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-parent</artifactId>
	<version>2.0.4.RELEASE</version>
</parent>

<dependencies>
	<!-- Spring Boot Starter Web Dependency -->
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-web</artifactId>
	</dependency>
</dependencies>
```
3. Update the maven project.

**Using STS (Spring Tool Suite) :**  

The Spring IDE is an open source project that provides various plugins for IDEs to make them understand and handle Spring Projects. The Spring Tool Suite itself is an IDE released as Eclipse Distribution to easily design and maintain spring projects. Using STS Eclipse IDE one can generate Spring Boot Project :
1. Download & Install STS IDE or STS Plugin for Eclipse IDE.
2. Select _File -> New -> SpringStarterApplication_
3. Fill in the project details, click _Next_.
4. Select Dependencies for your project then click on _Finish_.
5. The project will be generated.

**Using Spring Initializer :**  

Spring Initializer is a web tool provided by Spring at its official website. It is quickest way to generate a Spring Boot project.
1. Go to [Spring Initializer Official Website](https://start.spring.io/)
2. Fill in the project details and select dependencies required for your project.
3. Click on _Generate Project_ button and the project will be downloaded shortly.

**Using Spring Boot CLI :**  

Spring Boot CLI (Command Line Interface) is a Spring Boot software to run and test Spring Boot applications from command prompt. When we run Spring Boot applications using CLI, then it internally uses Spring Boot Starter and Spring Boot AutoConfigurate components to resolve all dependencies and execute the application.  

### Creating First Spring Boot Web Application

Generate a spring boot project using any method of your above mentioned choice. Let's define classes to print a simple Hello World.

* Create a class *HelloController.java*

```java
@RestController
@EnableAutoConfiguration
public class HelloController {

    @GetMapping(value = "/hello")
    public String sayHello(@RequestParam String name) {
        return "Hello World";
    }
```  

The **@GetMapping** annotation provides “routing” information. It tells Spring that any HTTP GET request with the _/hello_ path should be mapped to the *sayHello* method. The **@RestController** annotation tells Spring to render the resulting string directly back to the caller. The @RestController and @GetMapping annotations are Spring MVC annotations. (They are not specific to Spring Boot). 

* Create a class *HelloAppLauncher.java*

```java
@SpringBootApplication
public class HelloAppLauncher {

	public static void main(String[] args) {
		SpringApplication.run(HelloAppLauncher.class, args);
	}
}
```

The main method is entry point for SpringBootApplication. Many Spring Boot developers like their apps to use auto-configuration, component scan and be able to define extra configuration on their "application class". A single **@SpringBootApplication** annotation can be used to enable those three features :  
**@EnableAutoConfiguration** annotation tells Spring Boot to “guess” how you want to configure Spring, based on the jar dependencies that you have added. Since **spring-boot-starter-web** dependency added Tomcat and Spring MVC, the auto-configuration assumes that you are developing a web application and sets up Spring accordingly.  
**@ComponentScan** annotation enable @Component scan on the package where the application is located.  
**@Configuration** annotation allow to register extra beans in the context or import additional configuration classes.

### How To Run
Run the application using main class **HelloAppLauncher.java**