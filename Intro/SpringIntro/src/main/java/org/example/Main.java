package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// by default springboot works on 8080 port and we can change it also
// tomcat is a server engine which runs the application on your system(server) it says tomcat started on port 8080
// we identify the server by its ip address and your system address is 127.0.0.1(known as local host)
// now the springboot application is running on my local host 127.0.0.1:8080 (:8080 it represents it is hosted on port 8080)
//based on annotations springboot will do the work eg: @Component will create an object of the class where it was declared

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class,args);
    }
}