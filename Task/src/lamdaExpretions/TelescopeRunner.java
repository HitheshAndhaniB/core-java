package lamdaExpretions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TelescopeRunner {
    public static void main(String[] args) {
        TelescopeDto telescope1 = new TelescopeDto(80.0, 1200.0, "ABC Optics", "Model123");
        TelescopeDto telescope2 = new TelescopeDto(102.0, 1500.0, "XYZ Telescopes", "Model456");
        TelescopeDto telescope3 = new TelescopeDto(70.0, 1000.0, "DEF Instruments", "Model789");
        TelescopeDto telescope4 = new TelescopeDto(150.0, 1800.0, "GHI Telescopics", "Model321");
        TelescopeDto telescope5 = new TelescopeDto(90.0, 1300.0, "JKL Optics", "Model654");
        List<TelescopeDto> list = new ArrayList<>();
        list.add(telescope1);
        list.add(telescope2);
        list.add(telescope3);
        list.add(telescope4);
        list.add(telescope5);
        System.out.println("==========================================");
        System.out.println("ascending order aperture");
        Collections.sort(list,(o1, o2)->(Double.compare(o1.getAperture(),o2.getAperture())));
        for (TelescopeDto  aperture: list) {
            System.out.println(aperture);
        }
        System.out.println("==========================================");
        System.out.println("Descending order aperture");
        Collections.sort(list,(o1, o2)->(Double.compare(o2.getAperture(),o1.getAperture())));
        for (TelescopeDto  aperture: list) {
            System.out.println(aperture);
        }
        System.out.println("==========================================");
        System.out.println("ascending order length");
        Collections.sort(list,(o1, o2)->(Double.compare(o1.getFocalLength(),o2.getFocalLength())));
        for (TelescopeDto  length: list) {
            System.out.println(length);
        }
        System.out.println("==========================================");
        System.out.println("descending order length");
        Collections.sort(list,(o1, o2)->(Double.compare(o2.getFocalLength(),o1.getFocalLength())));
        for (TelescopeDto  length: list) {
            System.out.println(length);
        }
        System.out.println("==========================================");
        System.out.println("ascending order manufacture");
        Collections.sort(list,(o1, o2)->o1.getManufacturer().compareTo(o2.getManufacturer()));
        for (TelescopeDto  manufacture: list) {
            System.out.println(manufacture);
        }
        System.out.println("==========================================");
        System.out.println("ascending order manufacture");
        Collections.sort(list,(o1, o2)->o2.getManufacturer().compareTo(o1.getManufacturer()));
        for (TelescopeDto  manufacture: list) {
            System.out.println(manufacture);
        }
        System.out.println("==========================================");
        System.out.println("ascending order model");
        Collections.sort(list,(o1, o2)->o1.getModel().compareTo(o2.getModel()));
        for (TelescopeDto  model: list) {
            System.out.println(model);
        }
        System.out.println("==========================================");
        System.out.println("ascending order model");
        Collections.sort(list,(o1, o2)->o2.getModel().compareTo(o1.getModel()));
        for (TelescopeDto  model: list) {
            System.out.println(model);
        }


    }
}
