package com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:Application.properties")
public class Business {
    @Value("${user}")
    private String userName;

    @Value("${password}")
    private int password;

    private Employee employee;

    public Business(){
        System.out.println("creating  no argument const....");
    }

    public Business(Employee employee) {
        this.employee = employee;
    }

    @Bean
    public String info(){
        System.out.println("userName :"+userName);
        System.out.println("password :"+password);
        return "show";
    }


//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public void setPassword(int password) {
//        this.password = password;
//    }
}
