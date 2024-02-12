package lamdaExpretions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VentilaterRunner {
    public static void main(String[] args) {
        VentilaterDto ventilator1 = new VentilaterDto("Dyson", "V11", 600,  "Remote");
        VentilaterDto ventilator2 = new VentilaterDto("Honeywell", "HT-900", 200,  "Manual");
        VentilaterDto ventilator3 = new VentilaterDto("Lasko", "T42951", 300,  "Digital");
        VentilaterDto ventilator4 = new VentilaterDto("Vornado", "y660", 550,  "Rotary");
        VentilaterDto ventilator5 = new VentilaterDto("Blueair", "Blue Pure Fan", 400,  "App Control");

        List<VentilaterDto> list = new ArrayList<>();
        list.add(ventilator1);
        list.add(ventilator2);
        list.add(ventilator3);
        list.add(ventilator4);
        list.add(ventilator5);

        System.out.println("ascending order Brand");
        Collections.sort(list,(o1, o2)->o1.getBrand().compareTo(o2.getBrand()));
        for (VentilaterDto brand : list) {
            System.out.println(brand);
        }
        System.out.println("============================================");
        System.out.println("Descending order location");
        Collections.sort(list,(o1, o2)->o2.getBrand().compareTo(o1.getBrand()));
        for (VentilaterDto brand : list) {
            System.out.println(brand);
        }
        System.out.println("=================================================");
        System.out.println("ascending order Model");
        Collections.sort(list,(o1, o2)->o1.getModel().compareTo(o2.getModel()));
        for (VentilaterDto model : list) {
            System.out.println(model);
        }
        System.out.println("=================================================");
        System.out.println("Descending order Model");
        Collections.sort(list,(o1, o2)->o2.getModel().compareTo(o1.getModel()));
        for (VentilaterDto model : list) {
            System.out.println(model);
        }
        System.out.println("========================================");
        System.out.println("ascending order Airflow");
        Collections.sort(list,(o1,o2)->(Integer.compare(o1.getAirflow(),o2.getAirflow())));
        for (VentilaterDto airFlow : list) {
            System.out.println(airFlow);
        }
        System.out.println("========================================");
        System.out.println("Descending order Airflow");
        Collections.sort(list,(o1,o2)->(Integer.compare(o2.getAirflow(),o1.getAirflow())));
        for (VentilaterDto airFlow : list) {
            System.out.println(airFlow);
        }
        System.out.println("ascending order Control");
        Collections.sort(list,(o1, o2)->o1.getControlType().compareTo(o2.getControlType()));
        for (VentilaterDto control : list) {
            System.out.println(control);
        }
        System.out.println("Descending order Control");
        Collections.sort(list,(o1, o2)->o2.getControlType().compareTo(o1.getControlType()));
        for (VentilaterDto control : list) {
            System.out.println(control);
        }
    }
}
