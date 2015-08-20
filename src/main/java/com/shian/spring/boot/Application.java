package com.shian.spring.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@ComponentScan("com.shian.spring.boot")
@Configuration
public class Application extends SpringApplication {


    public static Logger log = LoggerFactory.getLogger(Application.class.getCanonicalName());

    public static void main(String[] args) {
        log.info("Starting application");
        SpringApplication.run(Application.class, args);
    }
}
