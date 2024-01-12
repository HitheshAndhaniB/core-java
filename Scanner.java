package com.xworkz.task.clone;

import lombok.*;

@ToString@AllArgsConstructor@NoArgsConstructor@Setter@Getter
public class Scanner implements Cloneable{
    private String brand;
    private double cost;


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
