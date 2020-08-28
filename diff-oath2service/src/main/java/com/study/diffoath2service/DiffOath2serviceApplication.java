package com.study.diffoath2service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class DiffOath2serviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiffOath2serviceApplication.class, args);
    }

}
