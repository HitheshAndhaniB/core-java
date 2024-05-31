package com.xworkz.spring.bean;

import com.xworkz.spring.dto.HotelDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.naming.Binding;
import javax.validation.Valid;

@Component
@RequestMapping("/")
public class HotelBean {


    public HotelBean(){
        System.out.println("HotelBean no arg cont created.....");
    }

    @PostMapping("/hotel")
    public String HotelBean(@Valid HotelDTO dto, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            System.out.println("HotelBean Finding an Errors...");
            bindingResult.getAllErrors().forEach(objectErrors-> System.out.println(objectErrors.getDefaultMessage()));
            model.addAttribute("errors",bindingResult.getAllErrors());
            model.addAttribute("dto",dto);
            return "Hotel.jsp";

        }
        else {
            System.out.println("running Hotelbean.....");
            model.addAttribute("name", "Thanks for ordering..." + dto.getName());
            System.out.println(dto);
        }
        return "final.jsp";
    }

}
