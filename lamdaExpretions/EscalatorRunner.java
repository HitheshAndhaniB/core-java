package lamdaExpretions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EscalatorRunner {
    public static void main(String[] args) {
        EscalatorDto escalator1 = new EscalatorDto("Otis", "Xpress 2000", 120, 3500);
        EscalatorDto escalator2 = new EscalatorDto("Kone", "TravelMaster 110", 100, 1000);
        EscalatorDto escalator3 = new EscalatorDto("Schindler", "9300AE", 150, 6000);
        EscalatorDto escalator4 = new EscalatorDto("Thyssenkrupp", "Evolution 300", 90, 2500);
        EscalatorDto escalator5 = new EscalatorDto("Mitsubishi", "NexWay", 130, 4200);
        List<EscalatorDto> list = new ArrayList<>();
        list.add(escalator1);
        list.add(escalator2);
        list.add(escalator3);
        list.add(escalator4);
        list.add(escalator5);

        System.out.println("ascending order name");
        Collections.sort(list,(o1, o2)->o1.getBrand().compareTo(o2.getBrand()));
        for (EscalatorDto brand : list) {
            System.out.println(brand);
        }
        System.out.println("==========================================");
        System.out.println("descending order name");
        Collections.sort(list,(o1, o2)->o2.getBrand().compareTo(o1.getBrand()));
        for (EscalatorDto brand : list) {
            System.out.println(brand);
        }
        System.out.println("==========================================");
        System.out.println("ascending order model");
        Collections.sort(list,(o1, o2)->o1.getModel().compareTo(o2.getModel()));
        for (EscalatorDto model : list) {
            System.out.println(model);
        }
        System.out.println("==========================================");
        System.out.println("descending order model");
        Collections.sort(list,(o1, o2)->o2.getModel().compareTo(o1.getModel()));
        for (EscalatorDto model : list) {
            System.out.println(model);
        }
        System.out.println("==============================");
        System.out.println("ascending order Capacity");
        Collections.sort(list,(o1,o2)->(Integer.compare(o1.getCapacity(),o2.getCapacity())));
        for (EscalatorDto capacity : list) {
            System.out.println(capacity);
        }
        System.out.println("==============================");
        System.out.println("descending order Capacity");
        Collections.sort(list,(o1,o2)->(Integer.compare(o2.getCapacity(),o1.getCapacity())));
        for (EscalatorDto capacity : list) {
            System.out.println(capacity);
        }
        System.out.println("==============================");
        System.out.println("ascending order Cost");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getCost(),o2.getCost())));
        for (EscalatorDto capacity : list) {
            System.out.println(capacity);
        }
        System.out.println("==============================");
        System.out.println("Descending order Cost");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getCost(),o1.getCost())));
        for (EscalatorDto capacity : list) {
            System.out.println(capacity);
        }




    }
}
