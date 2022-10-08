# MICROSERVICES - EXPLORED

1. A Microservices Project, Developed with Spring Boot, Eureka services, built with Curiosity and learning about this Architecture Design.

2. Tech Used: **Spring Boot**, **Java**, **PostMan**, **Eureka Service Registry**, **Eureka Client**, **Zipkin And Sleuth**, **MySQL**, Lombok.

3. Prominent Features Include: 

     - Microservices Driven Architecture 
     - API Gateway Implemented
     - Eureka Service Registry
     - Eureka Client 
     - Client Side Loadbalancing
     - Distributed Logging using Zipkin And Sleuth.
     - MySQL database
     - Cross Services Interactions
     - Centralised Configurations Service to store Eureka Client Configurations to connect to Eureka Server.
     
4. Tools Used: 
    
    1. IntellJ idea Ultimate Edition.
    2. Eureka Service Discovery
    3. Zipkin And Sleuth for Distributed Logging
    4. MySQL database.
    5. Github for Version Control.
    6. Lombok Library for AutoCode Generation
    7. PostMan.
    8. Maven Dependency Manager
    

## STEPS TO RUN 

1. Clone the repo, and open in IntellJ Idea, or any preferred IDE.
2. Start With running the Service Registry Service First, as this Service acts as the Eureka Server
3. After this Start the Config Server, this service Fetches Configurations from Github of Eureka Clients ( was used by every service hence extracted out and made a service out of it) , and is used by other service to connect to the Eureka Server.
4. Start the Gateway Service, User Service, Department Service.
5. Hit the API using Postman or IntellJ idea's inbuilt API Manager.
 
 ## LEARNINGS AND EXPERIENCE.
 
 The Project was a good learning exercise that helped understand:
 
 1. How Spring Boot Works.
 2. How Microservices Architecture Works.
 3. How Cross Services Communication Works.
 4. How API Gateway works.
 5. How Distributed Logging Works.
 6. How To Structure Spring Boot Applications.
 7. How to Connect to Database using Spring Boot.

