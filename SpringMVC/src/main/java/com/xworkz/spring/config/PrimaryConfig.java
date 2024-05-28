package com.xworkz.spring.config;

import com.xworkz.spring.beans.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring.beans")
public class PrimaryConfig {

   public PrimaryConfig(){
       System.out.println("no argument constructer created.....");
    }

    @Bean
    public Employee employeeinfo(){
        System.out.println("display info"+employeeinfo());
        return null;
    }

    @Bean
    public int id(){
        System.out.println("display id");
        return 123;
    }

    @Bean
    public String name(){
        System.out.println("display name...");
        return "Anil";
    }
}
