package com.xworkz.spring.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Setter
@Getter
@ToString
@Component
public class ContactDTO {

    public String name;

    public String email;

    public String mobileNO;

    public String comments;

    public ContactDTO(){
        System.out.println("ContactDto no arg conts created......");
    }
}
