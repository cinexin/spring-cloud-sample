# Spring Cloud sample

## Introduction
This project consists of 6 microservices that can act as a scaffold for a project using Spring Cloud microservices architecture 

This project is based on the udemy course https://www.udemy.com/course/microservices-with-spring-boot-and-spring-cloud

More concretely, the "Microservices with Spring cloud" part. 

The things that _IMHO_ can add some value to the projects already uploaded by the authour are:
 * All code is written in Kotlin
 * Code is structured using best practices recommendations
 * Microservices are organized in maven submodules
 * Just checkout the code, start the microservices and you're good to go
 * Postman endpoints are ready to be imported for testing directly in your local 
 
 Spring Cloud version used is Greenwich.RELEASE   

## Getting started

### Prerequisites

- Maven
- Java (JDK 1.8 or above)

### Installing

Just checkout the code and:
```mvn install```


## Microservices

### Configuration service
This is a basic Spring Cloud configuration service, which connects to a git repo containing configuration for different environments.

Check out the code at: https://github.com/cinexin/git-localconfig-repo for a _ready-to-go_ sample

### Limits service
This service connects with configuration service to get some dynamic values and return them using _REST_ services

### Currency exchange service 
This service acts as a very basic currency exchange multiplier

ie: What's the conversion multiplier between EUR a USD?

### Currency conversion service
This service uses _Currency exchange_ service to convert a quantity from a currency to another. Remember that these services are only for sample purposes and don't reflect the reality at all. 

Don't blame me if you try to use it as a real converter and lose money in the stock markets XDD

### Naming server
This service is a _ Netflix Eureka_ service and acts as a registry and discovery of microservices

### Gateway server
This service uses _Zuul_ to act as a gateway for the different microservices

## Postman 
Additionaly, there's a folder named _postman-endpoints_ where you can find all collections ready to be imported to _Postman_ (along with some environment file -_local.postman_environment.json_ to be able to modify your service ports and so)

This way you can follow and test the microservices easily


# Authors

As said, the main authour of this is Andhra Pradesh of https://courses.in28minutes.com/

As of the person who adapted and writing this, this is me:


| Name        | Twitter           | Github  | Email
| ------------- |:-------------:| -----:| ------:
| *Miguel Ángel Guillamón*      | cineexin | cinexin | migueguillamon@gmail.com


# License

This project is licensed under _GNU General Public License_ See 
[License file](../LICENSE) for details