package com.xworkz.spring.beans;

import com.xworkz.spring.DTO.MarriageDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class MarriageBean {

    public MarriageBean(){
        System.out.println("Creating MarriageBean....");
    }

    @PostMapping("/go")
    public String MarriageBean(MarriageDTO marriageDTO, Model m){
        System.out.println(marriageDTO);
//        m.addAttribute("name","");
        System.out.println("Running marriageDTo...");
        return "Marriage.jsp";
    }
}
