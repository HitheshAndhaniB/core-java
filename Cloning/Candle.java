package com.xworkz.task.clone;

import lombok.*;

@NoArgsConstructor@AllArgsConstructor@Setter@ToString@Getter
public class Candle implements Cloneable {
        private String brand;
        private double cost;
        private int quantity;
        private Light light;


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
