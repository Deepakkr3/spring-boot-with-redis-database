
# Project Title

This repository contains a simple REST API for managing user data using Java Spring Boot and Redis as an in-memory database.



## Overview
This REST API allows for basic user management operations such as creating, retrieving, listing, and deleting users. The data is stored in a Redis in-memory database to ensure fast access and retrieval.
## Installation
1. Clone the repository: git clone https://github.com/Deepakkr3/spring-boot-with-redis-database
2. Ensure you have Java and Maven installed. 
3. Install and run Redis.
## Tech Stack

## Backend
### Technologies Used
- java
- Spring boot
- Redis
 - docker


### Installation and Setup
1. Clone the repository

2. Run the  application

 



## The following endpoints are available in this API:


### Create a user
POST http://localhost:8080/user
Content-Type: application/json
{
  "userName": "mohit",
  "userEmail": "mohite@example.com",
  "userPhone": "+134567890",
  "userId": "user123"
}



### GET a product by id
GET  http://localhost:8080/user/user123

### Update a product by id
PATCH  http://localhost:8080/user/user123
Content-Type: application/json

{
  "userName": "raju",
  "userEmail": "mohite@example.com",
  "userPhone": "+134567890",
  "userId": "user123"
}


### Delete a product by id
DELETE  http://localhost:8080/user/user123

### 404 route Not Found
GET http://localhost:8080/abc_xyz



































#hrXWgw4Q127uqZJ3




## flow

- ├── Dockerfile
- ├── README.md
- ├── package.json
- ├── package-lock.json
- ├── src
- │   ├── app.js
- │   ├── config
- │   │   └── database.js
- │   ├── controllers
- │   │   └── productController.js
- │   ├── models
- │   │   └── product.js
- │   ├── routes
- │   │   └── productRoutes.js
- └── tests
-     └── product.test.js
