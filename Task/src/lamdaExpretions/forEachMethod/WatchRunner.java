package lamdaExpretions.forEachMethod;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WatchRunner implements Serializable{
    public static void main(String[] args) {
       WatchDto watch1 = new WatchDto("Rolex", 5000.00, "Analog", "Stainless Steel");
       WatchDto watch2 = new WatchDto("Casio", 100.00, "Digital", "Plastic");
       WatchDto watch3 = new WatchDto("Omega", 8000.00, "Analog", "Gold");
       WatchDto watch4 = new WatchDto("Tag Heuer", 6000.00, "Analog", "Titanium");
        WatchDto watch5 = new WatchDto("Seiko", 300.00, "Analog", "Leather");
        List<WatchDto> list = new ArrayList<>();
        list.add(watch1);
        list.add(watch2);
        list.add(watch3);
        list.add(watch4);
        list.add(watch5);


        System.out.println("Ascending order Brand");
        Collections.sort(list,(p1,p2)->p1.getBrand().compareTo(p2.getBrand()));
        list.forEach(watch -> System.out.println(watch));

        System.out.println("Decending order Brand");
        Collections.sort(list,(p1,p2)->p2.getBrand().compareTo(p1.getBrand()));
        list.forEach(watch -> System.out.println(watch));

        System.out.println("Ascending order Brand");
        Collections.sort(list,(o1,o2)->(Double.compare(o1.getPrice(),o2.getPrice())));
        list.forEach(watch -> System.out.println(watch));

        System.out.println("Decending order Brand");
        Collections.sort(list,(o1,o2)->(Double.compare(o2.getPrice(),o1.getPrice())));
        list.forEach(watch -> System.out.println(watch));

        System.out.println("Ascending order Type");
        Collections.sort(list,(p1,p2)->p1.getType().compareTo(p2.getType()));
        list.forEach(watch -> System.out.println(watch));

        System.out.println("Decending order Type");
        Collections.sort(list,(p1,p2)->p2.getType().compareTo(p1.getType()));
        list.forEach(watch -> System.out.println(watch));

        System.out.println("Ascending order Meterial");
        Collections.sort(list,(p1,p2)->p1.getMaterial().compareTo(p2.getMaterial()));
        list.forEach(watch -> System.out.println(watch));

        System.out.println("Decending order Meterial");
        Collections.sort(list,(p1,p2)->p2.getMaterial().compareTo(p1.getMaterial()));
        list.forEach(watch -> System.out.println(watch));





    }
}
