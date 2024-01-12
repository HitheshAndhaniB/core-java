package com.xworkz.task.boot;

import com.xworkz.task.clone.Candle;
import com.xworkz.task.clone.Light;
import com.xworkz.task.clone.Plastic;
import com.xworkz.task.clone.Scanner;

public class CandleRunner {
    public static void main(String[] args)throws CloneNotSupportedException {

        System.out.println("Running main in Scanner");
        Scanner scanner = new Scanner("Pillip",15000);
        Object scanner1 = (Scanner)scanner.clone();
        System.out.println(scanner);
        System.out.println(scanner1);
        System.out.println("--------------------------");

        System.out.println("Running main in Plastic");
        Plastic plastic = new Plastic("paper",20);
        Object plastic1 = (Plastic)plastic.clone();
        System.out.println(plastic);
        System.out.println(plastic1);
        System.out.println("----------------------------");

        System.out.println("Running main in Light");
        Light light=new Light("lg",99,6);
        Object light1 = (Light)light.clone();
        System.out.println(light);
        System.out.println(light1);
        System.out.println("------------------------------");

        //Shallow Cloning
        System.out.println("Running main in Candle");
        Candle candle = new Candle("King",999,5,light);
        Object candle1 = (Candle)candle.clone();
        System.out.println(candle);
        System.out.println(candle1);
        candle.getLight().setLightBrand("Pillips");
        System.out.println(candle.getLight().getLightBrand());
        System.out.println(((Candle)candle1).getLight().getLightBrand());

        System.out.println("--------------------------");

        //


    }
}
