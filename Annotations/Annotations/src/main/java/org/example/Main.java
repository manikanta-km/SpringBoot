package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// when springboot starts then it will checks the all annotations in the package where @springbootapplication is written and it will
// not check the annotations present in other packages
@ComponentScan(basePackages={"org.example","outer"})
// to increase the visibility to other packages we use this annotation and place the packages which we want in bracket
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}


