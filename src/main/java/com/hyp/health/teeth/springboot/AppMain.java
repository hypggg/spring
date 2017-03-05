package com.hyp.health.teeth.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.hyp.health.teeth"})
public class AppMain    {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppMain.class, args);
    }
}