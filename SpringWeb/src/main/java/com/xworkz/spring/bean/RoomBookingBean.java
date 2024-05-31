package com.xworkz.spring.bean;

import com.xworkz.spring.dto.RoomBookingDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Component
@RequestMapping("/")
public class RoomBookingBean {

    public RoomBookingBean(){
        System.out.println("RoomBooking no argu consr created.....");
    }

    @PostMapping("/room")
    public String RoomBooking(@Valid RoomBookingDTO roomBookingDTO, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            System.out.println("RoomBooking finding an error....");
            bindingResult.getAllErrors().forEach(objectErrors-> System.out.println(objectErrors.getDefaultMessage()));
            model.addAttribute("errors",bindingResult.getAllErrors());
            model.addAttribute("roomDto",roomBookingDTO);
            return "RoomBooking.jsp";
        }
        else{
            System.out.println("running RoomBooking.....");
            model.addAttribute("roomDto", "Thanks for Booking Room..." + roomBookingDTO.getName());
            System.out.println(roomBookingDTO);
            return "final.jsp";
        }

    }
}
