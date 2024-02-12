package DTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Sensors sensors = new Sensors("Ultrasonic","Find distance",300,20);
        Sensors sensors1 = new Sensors("Sound","detects sound",250,100);
        Sensors sensors2 = new Sensors("motion","detects motion",350,50);
        Sensors sensors3 = new Sensors("LDR","detects light",250,70);
        Sensors sensors4 = new Sensors("Accelometer","detects Acelaration",400,100);

        List<Sensors> list = new ArrayList<>();
        list.add(sensors);
        list.add(sensors1);
        list.add(sensors2);
        list.add(sensors3);
        list.add(sensors4);

        for (Sensors s1:list) {
            System.out.println(s1);

        }


    }
}
