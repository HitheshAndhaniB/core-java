package lamdaExpretions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThermometerRunner {
    public static void main(String[] args) {
        ThermometerDto thermometer1 = new ThermometerDto(25.5, "Celsius", "ABC Corp", "Model123");
        ThermometerDto thermometer2 = new ThermometerDto(98.6, "Fahrenheit", "XYZ Inc", "Model456");
        ThermometerDto thermometer3 = new ThermometerDto(20.0, "Celsius", "DEF Ltd", "Model789");
        ThermometerDto thermometer4 = new ThermometerDto(75.0, "Fahrenheit", "GHI Co", "Model321");
        ThermometerDto thermometer5 = new ThermometerDto(30.5, "Celsius", "JKL Industries", "Model654");
        List<ThermometerDto> list = new ArrayList<>();
        list.add(thermometer1);
        list.add(thermometer2);
        list.add(thermometer3);
        list.add(thermometer4);
        list.add(thermometer5);
        System.out.println("==========================================");
        System.out.println("ascending order temparature");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getTemperature(),o2.getTemperature())));
        for (ThermometerDto  temparature: list) {
            System.out.println(temparature);
        }

        System.out.println("==========================================");
        System.out.println("descending order temparature");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getTemperature(),o1.getTemperature())));
        for (ThermometerDto  temparature: list) {
            System.out.println(temparature);
        }

        System.out.println("==========================================");
        System.out.println("ascending order scale");
        Collections.sort(list,(o1, o2)->o1.getScale().compareTo(o2.getScale()));
        for (ThermometerDto  scale: list) {
            System.out.println(scale);
        }
        System.out.println("==========================================");
        System.out.println("descending order scale");
        Collections.sort(list,(o1, o2)->o2.getScale().compareTo(o1.getScale()));
        for (ThermometerDto  scale: list) {
            System.out.println(scale);
        }
        System.out.println("==========================================");
        System.out.println("ascending order manufacture");
        Collections.sort(list,(o1, o2)->o1.getManufacturer().compareTo(o2.getManufacturer()));
        for (ThermometerDto  scale: list) {
            System.out.println(scale);
        }
        System.out.println("==========================================");
        System.out.println("descending order manufacture");
        Collections.sort(list,(o1, o2)->o2.getManufacturer().compareTo(o1.getManufacturer()));
        for (ThermometerDto  scale: list) {
            System.out.println(scale);
        }

        System.out.println("==========================================");
        System.out.println("ascending order model");
        Collections.sort(list,(o1, o2)->o1.getModel().compareTo(o2.getModel()));
        for (ThermometerDto model : list) {
            System.out.println(model);
        }
        System.out.println("==========================================");
        System.out.println("descending order model");
        Collections.sort(list,(o1, o2)->o2.getModel().compareTo(o1.getModel()));
        for (ThermometerDto model : list) {
            System.out.println(model);
        }





    }
}
