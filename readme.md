## 1. How to start
```
$ git clone https://github.com/crkarthik11/DemoApp.git
$ cd demoApp
$ mvnw spring-boot:run
$ curl -v localhost:8080
```

## Entities to create

### Lab
 - String name
 - String address
 - String phone
 - String pincode

 ### Tests
 - String name
 - String description
 - Double price


### Admin
 - String name
 - String  username
 - String  password
 
### Customer
 - String name
 - String address
 - String age
 - String gender


## APIs 

### Admin controller
 - List of admins - Must return 5 admin objects
 - Api to return single admin by username

### Lab controller
 - List of labs - Must return 5 labs in list
 - Api to return single lab by name

### Book controller
  - List of books -  Must return 5 books
  -  Api to return single book object

 