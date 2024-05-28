package com.xworkz.spring.beans;

import com.xworkz.spring.DTO.ContactDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ContactBean {

    public ContactBean(){
        System.out.println("ContactBean contracter created.......");
    }

    @PostMapping("/contact")
    public String contactBean(ContactDTO contactDTO, Model model){
        System.out.println("ContactBean running....");
        model.addAttribute("name","Thanks for contact : "+contactDTO.getName());
        System.out.println(contactDTO);
        return "Contact.jsp";
    }
}
