package com.xworkz.spring.configration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz.spring")
@EnableWebMvc
public class ConfigInit {

    public ConfigInit(){
        System.out.println("configinit no argu const created...");
    }
}
