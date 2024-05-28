package com.xworkz.spring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.xworkz.spring")
@PropertySource("classpath:application.properties")
public class ConfigInit {

   public ConfigInit(){
        System.out.println("creating no argument constructer.......");
    }


}
