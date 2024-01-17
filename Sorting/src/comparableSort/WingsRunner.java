package comparableSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WingsRunner {
    public static void main(String[] args) {
        WingsDto wings1 = new WingsDto("Eagle Wings", 6.0, true, "Brown");
        WingsDto wings2 = new WingsDto("Butterfly Wings", 2.5, true, "Colorful");
        WingsDto wings3 = new WingsDto("Dragon Wings", 8.0, false, "Black");
        WingsDto wings4 = new WingsDto("Bat Wings", 4.5, true, "Dark Brown");
        WingsDto wings5 = new WingsDto("Angel Wings", 7.0, true, "White");

        List<WingsDto> list = new ArrayList<>();
        list.add(wings1);
        list.add(wings2);
        list.add(wings3);
        list.add(wings4);
        list.add(wings5);

        Collections.sort(list);
        System.out.println("after sorting Type in ascending order");
        for(WingsDto ref:list) {
            System.out.println(ref);
        }

        Collections.sort(list,(o1,o2)->o2.getType().compareTo(o1.getType()));
        System.out.println("after sorting type in descending order");
        for(WingsDto ref:list) {
            System.out.println(ref);
        }

    }
}
