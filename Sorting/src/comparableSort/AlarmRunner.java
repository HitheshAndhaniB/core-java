package comparableSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlarmRunner {
    public static void main(String[] args) {
        AlarmDto alram1 = new AlarmDto("Brand1", 50,  "Beep", 7);
        AlarmDto alram2 = new AlarmDto("Brand2", 60,  "Ring", 8);
        AlarmDto alram3 = new AlarmDto("Brand3", 40,  "Buzz", 6);
        AlarmDto alram4 = new AlarmDto("Brand4", 75,  "Chime", 9);
        AlarmDto alram5 = new AlarmDto("Brand5", 55,  "Alarm", 10);

        List<AlarmDto> list = new ArrayList<>();
        list.add(alram1);
        list.add(alram2);
        list.add(alram3);
        list.add(alram4);
        list.add(alram5);

        Collections.sort(list);
        System.out.println("after sorting type in ascending order");
        for(AlarmDto ref:list) {
            System.out.println(ref);
        }

    }

    }

