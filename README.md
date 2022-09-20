# Spring-Boot-Microservice

## INTRODUCTION 

1. This is a project made using the microservice architecture.

2. It has API Gateway, Service Registry, Client Side Loadbalancing, Centralised Configuration (Configuration Stored in Git), Distributed Loggin 

3. The Project is made in Spring Boot. 

4. It Uses Eueraka Server for creating Service Registry, and Eureka clients for service discovery, which also acts as client side load balancers

5. Zipkin And Sleuth is used for distributed Logging

6. Centralised Configurations have been implemented by storing the configuration on git, and using a specialised service to fetch the configurations from internet

## STEPS TO RUN 

1. Clone the repo, and open in IntellJ Idea, or any preferred Ide.

2. Start With running the Service Registry Service First, as this Service acts as the Eureka Server

3. After this Start the Config Server, this service Fetches Configurations from Github, and is used by other service to connect to the Eureka Server.

4. Start the Gateway Service, User Service, Department Service

 
