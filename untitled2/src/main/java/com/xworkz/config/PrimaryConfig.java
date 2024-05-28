package com.xworkz.mvc.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.xworkz.mvc")
public class PrimaryConfig {

    public PrimaryConfig(){
        System.out.println("no argument constracter created in primaryConfig....");
    }
}
