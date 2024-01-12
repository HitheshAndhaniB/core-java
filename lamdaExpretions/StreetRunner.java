package lamdaExpretions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreetRunner {
    public static void main(String[] args) {
        StreetDto street1 = new StreetDto("Main Street", 1000, 20, "Cityville");
        StreetDto street2 = new StreetDto("Broadway", 800, 30, "Metropolis");
        StreetDto street3 = new StreetDto("Ocean Avenue", 1200, 25, "Seatown");
        StreetDto street4 = new StreetDto("Maple Drive", 600, 15, "Suburbia");
        StreetDto street5 = new StreetDto("Highway 101", 2000, 40, "Interstate City");
        List<StreetDto> list = new ArrayList<>();
        list.add(street1);
        list.add(street2);
        list.add(street3);
        list.add(street4);
        list.add(street5);

        System.out.println("ascending order name");
        Collections.sort(list,(o1, o2)->o1.getName().compareTo(o2.getName()));
        for (StreetDto name : list) {
            System.out.println(name);
        }
        System.out.println("==============================");
        System.out.println("descending order name");
        Collections.sort(list,(o1, o2)->o2.getName().compareTo(o1.getName()));
        for (StreetDto name : list) {
            System.out.println(name);
        }
        System.out.println("==============================");
        System.out.println("ascending order Length");
        Collections.sort(list,(o1,o2)->(Integer.compare(o1.getLength(),o2.getLength())));
        for (StreetDto length : list) {
            System.out.println(length);
        }
        System.out.println("==============================");
        System.out.println("ascending order Length");
        Collections.sort(list,(o1,o2)->(Integer.compare(o2.getLength(),o1.getLength())));
        for (StreetDto length : list) {
            System.out.println(length);
        }
        System.out.println("==============================");
        System.out.println("ascending order Width");
        Collections.sort(list,(o1,o2)->(Integer.compare(o1.getWidth(),o2.getWidth())));
        for (StreetDto width : list) {
            System.out.println(width);
        }
        System.out.println("================================");
        System.out.println("ascending order city");
        Collections.sort(list,(o1, o2)->o1.getCity().compareTo(o2.getCity()));
        for (StreetDto city : list) {
            System.out.println(city);
        }
        System.out.println("================================");
        System.out.println("ascending order city");
        Collections.sort(list,(o1, o2)->o2.getCity().compareTo(o1.getCity()));
        for (StreetDto city : list) {
            System.out.println(city);
        }




    }
}
