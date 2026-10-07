MICROSERVICES API GATEWAY PROJECT

There are 4 separate Spring Boot Maven projects:

1. StudentMicroservice
   Port: 8081
   Endpoint: http://localhost:8081/students
   Application: StudentMicroserviceApplication

2. teacher-service
   Port: 8082
   Endpoint: http://localhost:8082/teachers
   Application: TeacherServiceApplication

3. library-service
   Port: 8083
   Endpoint: http://localhost:8083/books
   Application: LibraryServiceApplication

4. api-gateway
   Port: 8087

Gateway endpoints:
http://localhost:8087/students
http://localhost:8087/teachers
http://localhost:8087/books

IMPORT:
Extract the ZIP.
In STS choose:
File -> Import -> Maven -> Existing Maven Projects

Import each project separately.

RUN ORDER:
1. StudentMicroserviceApplication
2. TeacherServiceApplication
3. LibraryServiceApplication
4. ApiGatewayApplication

Java: 21
Spring Boot: 3.3.5
Spring Cloud Gateway: 2023.0.3

IMPORTANT:
The student project is intentionally named StudentMicroservice because
StudentService already exists in the user's STS workspace.
