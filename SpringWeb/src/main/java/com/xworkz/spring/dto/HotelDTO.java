package com.xworkz.spring.dto;


import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Component
public class HotelDTO {


    @NotNull(message = "Enter valid name")
    @Size(min = 2,max = 10 ,message = "Name is Invalid")

    public String name;

//    @NotNull(message = "Enter valid phone number")
    @Min(2)
    @Max(99999999999L)
    @NotNull(message = "please enter number")
    public Long phone;

    @NotNull(message = "Select Menu")
    public String menu;

    @NotNull(message = "select Payment type")
    public String type;

    public HotelDTO(){
        System.out.println("HotelDTO no argu const created .....");
    }


    public String getName() {
        return name;
    }



    public String getMenu() {
        return menu;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void setType(String type) {
        this.type = type;
    }


    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "HotelDTO{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", menu='" + menu + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
