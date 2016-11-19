#RESTFull API's using Spring boot
This sample is example of how to create *RESTFull* API's using Spring Boot

This sample contains examples of `GET` and `POST` request's with different media types and query params

##How to run
`mvn spring-boot:run`
This will start the application on port 8080 by default

##How to test

All the API's in this sample can be tested using following details

1. `GET` without query param
  - **Location :** http://localhost:8080/hello
  - **Response(text/plain) :** Hello World! 
  
2. `GET` request with query param
  - **Location :** http://localhost:8080/hello/advanced?name=xyz
  - **Response(application/json) :** {"id":9,"name":"xyz"}
  
3. `GET` request with query param with custom status codes
  - **Location:** http://localhost:8080/hello/moreadvanced?name=xyz
  - **Response(application/json) :** {"id":9,"name":"xyz"}
  - **Status Code:** 200
  
4. `POST` request with custom type
  - **Location:** http://localhost:8080/hello
  - **Request(application/json) :** {"id":1,"name":"xyz"}
  - **Response(application/json) :** {"id":9,"name":"xyz"}
  - **Status Code:** 200
