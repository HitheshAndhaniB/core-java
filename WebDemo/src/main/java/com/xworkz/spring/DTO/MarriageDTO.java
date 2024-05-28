package com.xworkz.spring.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;


@Setter
@ToString
@Getter
@Component

public class MarriageDTO {

    public String name;

    public String mobileNumber;

    public int age;

    public String maritialStatus;

    public String qualification;

    public String religion;


    public String gender;

    public MarriageDTO(){
        System.out.println("Created MarriageDTO.........");
    }





}
