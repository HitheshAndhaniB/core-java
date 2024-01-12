package lamdaExpretions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RadioRunner {
    public static void main(String[] args) {
        RadioDto radio1 = new RadioDto("Sony", 101.5, 7, "Black");
        RadioDto radio2 = new RadioDto("Philips", 92.3, 5, "White");
        RadioDto radio3 = new RadioDto("Panasonic", 105.9, 8, "Silver");
        RadioDto radio4 = new RadioDto("Bose", 98.7, 6, "Red");
        RadioDto radio5 = new RadioDto("JBL", 89.1, 9, "Blue");

        List<RadioDto> list = new ArrayList<>();
        list.add(radio1);
        list.add(radio2);
        list.add(radio3);
        list.add(radio4);
        list.add(radio5);

        System.out.println("ascending order brand");
        Collections.sort(list,(o1,o2)->o1.getBrand().compareTo(o2.getBrand()));
        for (RadioDto brand : list) {
            System.out.println(brand);
        }
        System.out.println("========================================");

        System.out.println("ascending order brand");
        Collections.sort(list,(o1,o2)->o2.getBrand().compareTo(o1.getBrand()));
        for (RadioDto brand : list) {
            System.out.println(brand);
        }
        System.out.println("========================================");
        System.out.println("ascending order Frequency");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getFrequency(),o1.getFrequency())));
        for (RadioDto name : list) {
            System.out.println(name);
        }
        System.out.println("========================================");
        System.out.println("Descending order Frequency");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getFrequency(),o1.getFrequency())));
        for (RadioDto name : list) {
            System.out.println(name);
        }
        System.out.println("========================================");
        System.out.println("ascending order Volumelevel");
        Collections.sort(list,(o1,o2)->(Integer.compare(o1.getVolumeLevel(),o2.getVolumeLevel())));
        for (RadioDto volume : list) {
            System.out.println(volume);
        }
        System.out.println("========================================");
        System.out.println("Descending order Volumelevel");
        Collections.sort(list,(o1,o2)->(Integer.compare(o2.getVolumeLevel(),o1.getVolumeLevel())));
        for (RadioDto volume : list) {
            System.out.println(volume);
        }
        System.out.println("========================================");
        System.out.println("ascending order Color");
        Collections.sort(list,(o1,o2)->o1.getColor().compareTo(o2.getColor()));
        for (RadioDto color : list) {
            System.out.println(color);
        }
        System.out.println("========================================");
        System.out.println("ascending order Color");
        Collections.sort(list,(o1,o2)->o2.getColor().compareTo(o1.getColor()));
        for (RadioDto color : list) {
            System.out.println(color);
        }



    }
}