package com.xworkz.database.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString

public class StudentInfo {

    private  int rool_no;
    private  String name;
    private  String Branch;
    private  String place;

}
