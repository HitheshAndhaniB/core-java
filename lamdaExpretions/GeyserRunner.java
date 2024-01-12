package lamdaExpretions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeyserRunner {
    public static void main(String[] args) {
        GeyserDto geyser1 = new GeyserDto("AO Smith", "HSE-VAS", 15, "Electric");
        GeyserDto geyser2 = new GeyserDto("Racold", "Altro 2", 25,  "Electric");
        GeyserDto geyser3 = new GeyserDto("Bajaj", "Flora", 10,  "Gas");
        GeyserDto geyser4 = new GeyserDto("V-Guard", "Sprinhot", 20,  "Electric");
        GeyserDto geyser5 = new GeyserDto("Havells", "Puro Plus", 15,  "Solar");

        List<GeyserDto> list = new ArrayList<>();
        list.add(geyser1);
        list.add(geyser2);
        list.add(geyser3);
        list.add(geyser4);
        list.add(geyser5);

        System.out.println("ascending order Brand");
        Collections.sort(list,(o1, o2)->o1.getBrand().compareTo(o2.getBrand()));
        for (GeyserDto brand : list) {
            System.out.println(brand);
        }
        System.out.println("=================================");
        System.out.println("Descending order Brand");
        Collections.sort(list,(o1, o2)->o2.getBrand().compareTo(o1.getBrand()));
        for (GeyserDto brand : list) {
            System.out.println(brand);
        }
        System.out.println("=================================");
        System.out.println("ascending order Model");
        Collections.sort(list,(o1, o2)->o1.getModel().compareTo(o2.getModel()));
        for (GeyserDto model : list) {
            System.out.println(model);
        }
        System.out.println("=================================");
        System.out.println("Descending order Model");
        Collections.sort(list,(o1, o2)->o2.getModel().compareTo(o1.getModel()));
        for (GeyserDto model : list) {
            System.out.println(model);
        }
        System.out.println("========================================");
        System.out.println("ascending order Capacity");
        Collections.sort(list,(o1,o2)->(Integer.compare(o1.getCapacity(),o2.getCapacity())));
        for (GeyserDto capacity : list) {
            System.out.println(capacity);
        }
        System.out.println("========================================");
        System.out.println("Descnding order Capacity");
        Collections.sort(list,(o1,o2)->(Integer.compare(o2.getCapacity(),o1.getCapacity())));
        for (GeyserDto capacity : list) {
            System.out.println(capacity);
        }
        System.out.println("========================================");

        System.out.println("ascending order Source");
        Collections.sort(list,(o1, o2)->o1.getEnergySource().compareTo(o2.getEnergySource()));
        for (GeyserDto source : list) {
            System.out.println(source);
        }
        System.out.println("========================================");
        System.out.println("Descending order Source");
        Collections.sort(list,(o1, o2)->o2.getEnergySource().compareTo(o1.getEnergySource()));
        for (GeyserDto source : list) {
            System.out.println(source);
        }
    }
}
