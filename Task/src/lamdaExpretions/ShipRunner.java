package lamdaExpretions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShipRunner {
    public static void main(String[] args) {
        ShipDto ship1 = new ShipDto("Titanic", "Passenger Liner", 269, 24);
        ShipDto ship2 = new ShipDto("Mayflower", "Cargo Ship", 33, 5);
        ShipDto ship3 = new ShipDto("Queen Mary 2", "Cruise Liner", 345, 30);
        ShipDto ship4 = new ShipDto("USS Constitution", "Frigate", 62, 13);
        ShipDto ship5 = new ShipDto("HMS Victory", "First-rate Ship of the Line", 69, 8);
        List<ShipDto> list = new ArrayList<>();
        list.add(ship1);
        list.add(ship2);
        list.add(ship3);
        list.add(ship4);
        list.add(ship5);
        System.out.println("ascending order name");
        Collections.sort(list,(o1, o2)->o1.getName().compareTo(o2.getName()));
        for (ShipDto name : list) {
            System.out.println(name);
        }
        System.out.println("=================================================");
        System.out.println("descending order name");
        Collections.sort(list,(o1, o2)->o2.getName().compareTo(o1.getName()));
        for (ShipDto name : list) {
            System.out.println(name);
        }
        System.out.println("=================================================");
        System.out.println("ascending order Type");
        Collections.sort(list,(o1, o2)->o1.getType().compareTo(o2.getType()));
        for (ShipDto type : list) {
            System.out.println(type);
        }
        System.out.println("=================================================");
        System.out.println("descending order Type");
        Collections.sort(list,(o1, o2)->o2.getType().compareTo(o1.getType()));
        for (ShipDto type : list) {
            System.out.println(type);
        }
        System.out.println("========================================");
        System.out.println("ascending order Length");
        Collections.sort(list,(o1,o2)->(Integer.compare(o1.getLength(),o2.getLength())));
        for (ShipDto length : list) {
            System.out.println(length);
        }
        System.out.println("========================================");
        System.out.println("Descending order Length");
        Collections.sort(list,(o1,o2)->(Integer.compare(o2.getLength(),o1.getLength())));
        for (ShipDto length : list) {
            System.out.println(length);
        }
        System.out.println("========================================");
        System.out.println("ascending order maxSpeed");
        Collections.sort(list,(o1,o2)->(Integer.compare(o1.getMaxSpeed(),o2.getMaxSpeed())));
        for (ShipDto maxSpeed : list) {
            System.out.println(maxSpeed);
        }
        System.out.println("========================================");
        System.out.println("ascending order maxSpeed");
        Collections.sort(list,(o1,o2)->(Integer.compare(o2.getMaxSpeed(),o1.getMaxSpeed())));
        for (ShipDto maxSpeed : list) {
            System.out.println(maxSpeed);
        }

    }
}
