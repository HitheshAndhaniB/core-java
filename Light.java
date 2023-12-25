package com.xworkz.task.clone;

import lombok.*;

@NoArgsConstructor@Getter@Setter@AllArgsConstructor@ToString
public class Light implements Cloneable{
    private String lightBrand;
    private double lightCost;
    private int lightQuantity;


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
