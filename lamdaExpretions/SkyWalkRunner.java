package lamdaExpretions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SkyWalkRunner {
    public static void main(String[] args) {
        SkyWalkDto skyWalk1 = new SkyWalkDto("Sky Tower Observation Deck", 1000,  200, "New York");
        SkyWalkDto skyWalk2 = new SkyWalkDto("Eiffel Tower Skywalk", 900,  150, "Paris");
        SkyWalkDto skyWalk3 = new SkyWalkDto("Sky100 Hong Kong", 1200,  180, "Hong Kong");
        SkyWalkDto skyWalk4 = new SkyWalkDto("CN Tower EdgeWalk", 1500, 10, "Toronto");
        SkyWalkDto skyWalk5 = new SkyWalkDto("Tokyo Skytree Tembo Galleria", 1600,  250, "Tokyo");
        List<SkyWalkDto> list = new ArrayList<>();
        list.add(skyWalk1);
        list.add(skyWalk2);
        list.add(skyWalk3);
        list.add(skyWalk4);
        list.add(skyWalk5);

        System.out.println("ascending order Location");
        Collections.sort(list,(o1, o2)->o1.getLocation().compareTo(o2.getLocation()));
        for (SkyWalkDto location : list) {
            System.out.println(location);
        }
        System.out.println("============================================");
        System.out.println("Descending order location");
        Collections.sort(list,(o1, o2)->o2.getLocation().compareTo(o1.getLocation()));
        for (SkyWalkDto location : list) {
            System.out.println(location);
        }
        System.out.println("========================================");
        System.out.println("ascending order heigth");
        Collections.sort(list,(o1,o2)->(Integer.compare(o1.getHeight(),o2.getHeight())));
        for (SkyWalkDto height : list) {
            System.out.println(height);
        }
        System.out.println("========================================");
        System.out.println("Descending order heigth");
        Collections.sort(list,(o1,o2)->(Integer.compare(o2.getHeight(),o1.getHeight())));
        for (SkyWalkDto height : list) {
            System.out.println(height);
        }
        System.out.println("========================================");
        System.out.println("ascending order Capacity");
        Collections.sort(list,(o1,o2)->(Integer.compare(o1.getCapacity(),o2.getCapacity())));
        for (SkyWalkDto capacity : list) {
            System.out.println(capacity);
        }
        System.out.println("========================================");
        System.out.println("Descending order Capacity");
        Collections.sort(list,(o1,o2)->(Integer.compare(o2.getCapacity(),o1.getCapacity())));
        for (SkyWalkDto capacity : list) {
            System.out.println(capacity);
        }
        System.out.println("ascending order City");
        Collections.sort(list,(o1, o2)->o1.getCity().compareTo(o2.getCity()));
        for (SkyWalkDto city : list) {
            System.out.println(city);
        }
        System.out.println("============================================");
        System.out.println("Descending order City");
        Collections.sort(list,(o1, o2)->o2.getCity().compareTo(o1.getCity()));
        for (SkyWalkDto city : list) {
            System.out.println(city);
        }

   }
}
