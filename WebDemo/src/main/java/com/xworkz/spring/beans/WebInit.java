package com.xworkz.spring.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class WebInit {

    WebInit(){
        System.out.println("creating Webinit.....");
    }


    @PostMapping("/send")
    public String displayWeb(){
        System.out.println("running DisplayWeb...");
        return "index.jsp";
    }



}
