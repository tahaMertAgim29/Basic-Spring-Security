# Basic-Spring-Security

## Introduction

This is a basic Springboot project where you can make authorization, authentication, user detail information and filtering as security filter chain
using Visual Studio Code, Springboot and Postman to send Http Requests such as **POST**, **DELETE** and **PUT**. 


## Features

* Basic Authentication and Authorization
* Http Requests over Postman
* Security Configuration
* Filter Chain Fundamental and Filtering Concept
* Authorization based on Roles

## Prerequisities

* Visual Studio Code
* Springboot and Java Extension Packs
* Postman 

## Architecture

<pre>
  ├── src 
  │    ├── main
  │    │     ├── java/com/example/security 
  │    │                ├── config 
  │    │                │      └── SecurityConfig.java
  │    │                │
  │    │                ├── controller
  │    │                │      └── AdminController.java
  │    │                │      └── DemoController.java
  │    │                │      └── MemberController.java
  │    │                │
  │    │                ├── entity
  │    │                │      └── Admin.java 
  │    │                │      └── Member.java
  │    │                │
  │    │                ├── exception
  │    │                │      └── AdminNotFoundException.java
  │    │                │      └── MemberNotFoundException.java
  │    │                │
  │    │                │
  │    │                ├── repository
  │    │                │      └── AdminRepository.java
  │    │                │      └── MemberRepository.java
  │    │                │
  │    │                ├── service
  │    │                │      └── AdminService.java
  │    │                │      └── AdminServiceImp.java
  │    │                │      └── MemberService.java
  │    │                │      └── MemberServiceImp.java
  │    │                │
  │    │              
  │    ├── resources    
  │           ├── static
  │           ├── templates
  │           ├── application.properties
  </pre>

> [!WARNING]
> The Architecture is drawn depending on what it is cared on the folder while programming


## Platforms

![Springboot](https://img.shields.io/badge/Springboot-%236DB33F?style=for-the-badge&logo=springboot&logoColor=fff)
![Spring Security](https://img.shields.io/badge/Spring%20Security-%236DB33F?style=for-the-badge&logo=springsecurity&logoColor=%23ffff)
![Postman](https://img.shields.io/badge/Postman-%23FF6C37?style=for-the-badge&logo=postman&logoColor=%23ffff)
![MySQL](https://img.shields.io/badge/MySQL-%234479A1?style=for-the-badge&logo=mysql&logoColor=%23ffff)
![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-blue?style=for-the-badge&logo=vsc&logoColor=ffff)
![Java](https://img.shields.io/badge/Java-%23000000?style=for-the-badge&logo=openjdk&logoColor=ffff)



## Youtube Link
>[!TIP]
> You can use this Youtube playlist if you are interested in Spring Security. Since it is long, you should find the videos which are associated with Security

> [!WARNING]
> Before starting, you should be sure that you have already understood Springboot fundamentally otherwise it might be seen hard to you.

**Youtube Playlist (Find the Spring Security ones):**
(https://www.youtube.com/playlist?list=PLstEgQdEnMSY8Q2kRHFdUrwgB6VPL4CjC)

## MySQL Link

At the path of `src/resources/application.properties` you should check those lines for your MySQL Database Link.

- spring.datasource.url=jdbc:mysql://localhost:3306/YOUR_DATABASE
- spring.datasource.username=root
- spring.datasource.password=YOUR_PASSWORD

In the lines above, you should write your database name and your password instead of `YOUR_DATABASE` and `YOUR_PASSWORD` keywords in following.





