package com.xworkz.Streams;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor

@Getter
@Setter
@ToString

public class MedicineDto implements Serializable,Comparable<MedicineDto> {
    private  String name;
    private int id;
    private String company;
    private LocalDate expirydate;
    private  LocalDate manifacturedate;
    private double cost;

    private String[] ingredients;

    @Override
    public int compareTo(MedicineDto o) {
        return this.company.compareTo(o.company);
    }
}
