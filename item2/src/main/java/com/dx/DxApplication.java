package com.dx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class DxApplication {
    public static void main(String[] args){
        SpringApplication.run(DxApplication.class,args);
    }
}
