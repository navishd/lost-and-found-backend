
## Lost and Found Backend (Spring Boot)

This is the backend system for the **Lost and Found Application** built using **Spring Boot**, **Spring Data JPA**, **MySQL**, and **JWT-based authentication**. It handles user registration, login, and full CRUD operations for Items and Requests.

---

##  Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- Spring Security
- JWT (JSON Web Tokens)
- MySQL
- Maven
- Lombok

---

##  Features

-  User Registration and Login
-  Secure JWT-based Authentication
-  Role-based access (ADMIN, STAFF, USER)
-  CRUD for:
  - Items (`LOST`, `FOUND`, `CLAIMED`)
  - Requests (`PENDING`, `APPROVED`, `REJECTED`)
-  RESTful API endpoints
-  Spring Security Integration

---

##  Project Structure
lostfound-backend/
├── config/ # Security and JWT setup

├── controller/ # REST API endpoints

├── dto/ # Data Transfer Objects (login/auth)

├── entity/ # JPA entities (User, Item, Request)

├── repository/ # JPA Repositories

├── service/ # Business logic (UserDetailsService)

├── resources/
│ └── application.properties

└── LostAndFoundApp.java



## Create a database named lostfound in MySQL:

CREATE DATABASE lostfound;

## Update the src/main/resources/application.properties with your DB credentials:

spring.datasource.username=root

spring.datasource.password=your_password

## Build and Run
./mvnw spring-boot:run


##  Roles and Access
Role	          Permissions
USER     -	Submit/view items & requests
STAFF	   -  Same as USER
ADMIN    -	Full control (including delete)
















