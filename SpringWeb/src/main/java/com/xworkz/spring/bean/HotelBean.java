package com.xworkz.spring.bean;

import com.xworkz.spring.dto.HotelDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class HotelBean {


    public HotelBean(){
        System.out.println("HotelBean no arg cont created.....");
    }

    @PostMapping("/hotel")
    public String HotelBean(HotelDTO hotelDTO, Model model){
        System.out.println("running Hotelbean.....");
        model.addAttribute("name","thanks for ordering..."+hotelDTO.getName());
        System.out.println(hotelDTO);
        return "final.jsp";
    }

}
