#RESTFull API's using Spring boot
This sample is example of how to create *RESTFull* API's using Spring Boot

This sample contains examples of `GET` and `POST` request's with different media types and query params

##How to run
`mvn spring-boot:run`
This will start the application on port 8080 by default

##How to test

All the API's in this sample can be tested using following details

1. `GET` without query param
  1. **Location :** http://localhost:8080/hello
  2. **Response(text/plain) :** Hello World! 
  
2. `GET` request with query param
  1. **Location : ** http://localhost:8080/hello/advanced?name=xyz
  2. **Response(application/json) :** {"id":9,"name":"xyz"}
  
3. `GET` request with query param with custom status codes
  1. **Location: **http://localhost:8080/hello/moreadvanced?name=xyz
  2. **Response(application/json) :** {"id":9,"name":"xyz"}
  3. **Status Code: **200
  
4. `POST` request with custom type
  1. **Location:** http://localhost:8080/hello
  2. **Request(application/json) :** {"id":1,"name":"xyz"}
  3. **Response(application/json) :** {"id":9,"name":"xyz"}
  4. **Status Code:** 200
