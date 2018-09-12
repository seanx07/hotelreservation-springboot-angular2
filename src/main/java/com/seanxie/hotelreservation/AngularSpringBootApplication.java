package com.seanxie.hotelreservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class AngularSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppAngularSpringBootApplication.class, args);
    }
}
