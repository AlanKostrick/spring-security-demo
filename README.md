## Spring Security Demo

This project uses Spring **VERSION 1.5** and Spring Security to control access levels for both an admin user and a guest user. It creates one simple JPA entity...`Post` that takes on a field called `content`.  

### Dependencies Used
	- compile('org.springframework.boot:spring-boot-starter-security')
	- compile('org.springframework.boot:spring-boot-starter-thymeleaf')
	- compile('org.springframework.boot:spring-boot-starter-web')
	- compile ('org.thymeleaf.extras:thymeleaf-extras-springsecurity4')
	- compile('org.springframework.boot:spring-boot-starter-data-jpa')
	- runtime('org.springframework.boot:spring-boot-devtools')
	- runtime('com.h2database:h2')
	- testCompile('org.springframework.boot:spring-boot-starter-test')
	- testCompile('org.springframework.security:spring-security-test')
  
  ### How to run this app
  Go to `localhost:8080/` and you will be brought to a login page. If you login as username/password `admin` / `admin` you will have access
  to be able to add a post. If you login as `guest` / `password` you will be able to view the posts but not create one. 
  
  
