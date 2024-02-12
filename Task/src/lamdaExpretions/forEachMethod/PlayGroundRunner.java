package lamdaExpretions.forEachMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayGroundRunner {
    public static void main(String[] args) {

        PlayGroundDto playground1 = new PlayGroundDto("Central Park ", "Central Park", 2.5, 1000.0);
        PlayGroundDto playground2 = new PlayGroundDto("Greenwich Park ", "London", 3.2, 800.0);
        PlayGroundDto playground3 = new PlayGroundDto("Golden Gate Park ", "San Francisco", 4.8, 1200.0);
        PlayGroundDto playground4 = new PlayGroundDto("Yoyogi Park ", "Tokyo", 5.5, 1500.0);
        PlayGroundDto playground5 = new PlayGroundDto("Royal Park ", "Australia", 6.3, 900.0);
        List<PlayGroundDto> list = new ArrayList<>();
        list.add(playground1);
        list.add(playground2);
        list.add(playground3);
        list.add(playground4);
        list.add(playground5);

        System.out.println("Asecending order Name");
        Collections.sort(list,(p1,p2)->p1.getName().compareTo(p2.getName()));
        list.forEach(Ground -> System.out.println(Ground));

        System.out.println("Asecending order Name");
        Collections.sort(list,(p1,p2)->p2.getName().compareTo(p1.getName()));
        list.forEach(Ground -> System.out.println(Ground));

        System.out.println("Asecending order Location");
        Collections.sort(list,(p1,p2)->p1.getLocation().compareTo(p2.getLocation()));
        list.forEach(Ground -> System.out.println(Ground));

        System.out.println("Decending order Location");
        Collections.sort(list,(p1,p2)->p2.getLocation().compareTo(p1.getLocation()));
        list.forEach(Ground -> System.out.println(Ground));

        System.out.println("Asecending order Distence");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getDistence(),o2.getDistence())));
        list.forEach(Distance -> System.out.println(Distance));

        System.out.println("Decending order Distence");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getDistence(),o1.getDistence())));
        list.forEach(Distance -> System.out.println(Distance));

        System.out.println("Asecending order Area");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getArea(),o2.getArea())));
        list.forEach(Area -> System.out.println(Area));

        System.out.println("Decending order Area");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getArea(),o1.getArea())));
        list.forEach(Area -> System.out.println(Area));







    }
    }
