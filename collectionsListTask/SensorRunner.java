package collectionsListTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SensorRunner {
    public static void main(String[] args) {
        Sensors sensors1 = new Sensors("TempSensor1", "Temperature", 0.1, 200);
        Sensors sensors2 = new Sensors("LightSensor1", "Light", 1, 1000);
        Sensors sensors3 = new Sensors("ProximitySensor1", "Proximity", 0.5, 50);
        Sensors sensors4 = new Sensors("PressureSensor1", "Pressure", 0.05, 500);
        Sensors sensors5 = new Sensors("HumiditySensor1", "Humidity", 0.3, 100);

        List<Sensors> list=new ArrayList<>();
        list.add(sensors1);
        list.add(sensors2);
        list.add(sensors3);
        list.add(sensors4);
        list.add(sensors5);

        Comparator<Sensors> comparatorNameAsc=new SensorNameAse();
        Collections.sort(list,comparatorNameAsc);
        System.out.println("after sorting name in ascending order");
        for(Sensors name:list) {
            System.out.println(name);
        }
        System.out.println("======================================================");

        Comparator<Sensors> comparatorNameDesc=new SensorNameDesc();
        Collections.sort(list,comparatorNameDesc);
        System.out.println("after sorting name in descending order");
        for(Sensors name:list) {
            System.out.println(name);
        }
        System.out.println("=======================================================");
        Comparator<Sensors> comparatorTypeAsc=new SensorTypeAse();
        Collections.sort(list,comparatorNameAsc);
        System.out.println("after sorting type in ascending order");
        for(Sensors name:list) {
            System.out.println(name);
        }
        System.out.println("======================================================");

        Comparator<Sensors> comparatorTypeDesc=new SensorTypeDesc();
        Collections.sort(list,comparatorNameDesc);
        System.out.println("after sorting type in descending order");
        for(Sensors name:list) {
            System.out.println(name);
        }
        System.out.println("=======================================================");

        Comparator<Sensors> comparatorSensitivityAsc=new SensorSensitivityAsc();
        Collections.sort(list,comparatorNameAsc);
        System.out.println("after sorting Sensitivity in ascending order");
        for(Sensors name:list) {
            System.out.println(name);
        }
        System.out.println("======================================================");

        Comparator<Sensors> comparatorSensitivityDesc=new SensorSensitivityDesc();
        Collections.sort(list,comparatorNameDesc);
        System.out.println("after sorting Sensitivity in descending order");
        for(Sensors name:list) {
            System.out.println(name);
        }
        System.out.println("=======================================================");
        Comparator<Sensors> comparatorRangAsc=new SensorRangAsc();
        Collections.sort(list,comparatorNameAsc);
        System.out.println("after sorting Range in ascending order");
        for(Sensors name:list) {
            System.out.println(name);
        }
        System.out.println("======================================================");

        Comparator<Sensors> comparatorRangDesc=new SensorRangDesc();
        Collections.sort(list,comparatorNameDesc);
        System.out.println("after sorting Range in descending order");
        for(Sensors name:list) {
            System.out.println(name);
        }
        System.out.println("=======================================================");
    }
}
