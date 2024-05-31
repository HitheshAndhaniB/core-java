package com.xworkz.spring.dto;

import org.hibernate.validator.constraints.Email;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class RoomBookingDTO {

    @NotNull(message = "Enter valid name")
    @Size(min = 2,max = 10 ,message = "Name is Invalid")
    public String name;

    @Min(2)
    @Max(9999999999L)
    @NotNull(message = "Enter phone number")
    public Long phone;

    @Email(message = "Enter valid emailId")
    @NotNull(message = "Email is invalid")
    public String email;

    @NotNull(message = "select Payment type")
    public String type;

    @NotNull(message = "select Gender")
    public String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "RoomBookingDTO{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
