package com.naijab.int493softwarearch.week1.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class Lab1RestfulApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab1RestfulApiApplication.class, args);
    }

}
