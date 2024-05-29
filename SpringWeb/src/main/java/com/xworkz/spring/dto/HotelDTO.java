package com.xworkz.spring.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
public class HotelDTO {

    public String name;
    public String phone;
    public String menu;
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


}
