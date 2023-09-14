package com.example.UserManagementSystem;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class Beans {
    @Bean
    public List<UMS> dataSource(){
        return new ArrayList<>();
    }
}
