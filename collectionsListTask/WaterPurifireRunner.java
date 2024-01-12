package collectionsListTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WaterPurifireRunner {
    public static void main(String[] args) {
        WaterPurifier purifier1 = new WaterPurifier("Kent", "RO+UV", 8,  "Reverse Osmosis");
        WaterPurifier purifier2 = new WaterPurifier("Aquaguard", "Enhance", 7,  "UV Purification");
        WaterPurifier purifier3 = new WaterPurifier("Pureit", "Classic", 10,  "RO+UV");
        WaterPurifier purifier4 = new WaterPurifier("Livpure", "Pep Pro", 6,  "UV Purification");
        WaterPurifier purifier5 = new WaterPurifier("Blue Star", "Majesto", 12,  "RO+UV+UF");

        List<WaterPurifier> waterPurifiers = new ArrayList<>();
        waterPurifiers.add(purifier1);
        waterPurifiers.add(purifier2);
        waterPurifiers.add(purifier3);
        waterPurifiers.add(purifier4);
        waterPurifiers.add(purifier5);

        System.out.println("Ascending order based on Brand..");
        Comparator<WaterPurifier> comparatorBrand = new WaterPurifierBrandAsc();
        Collections.sort(waterPurifiers, comparatorBrand);
        for (WaterPurifier brand : waterPurifiers
        ) {
            System.out.println(brand);
        }
        System.out.println("==================================");

        System.out.println("Descending order based on Brand..");
        Comparator<WaterPurifier> comparatorBrand1 = new WaterPurifierBrandDesc();
        Collections.sort(waterPurifiers, comparatorBrand1);
        for (WaterPurifier brand : waterPurifiers
        ) {
            System.out.println(brand);
        }
        System.out.println("==================================");
        System.out.println("Ascending order based on Model..");
        Comparator<WaterPurifier> comparatorModel = new WaterPurifierModelAsc();
        Collections.sort(waterPurifiers, comparatorModel);
        for (WaterPurifier model : waterPurifiers
        ) {
            System.out.println(model);
        }
        System.out.println("==================================");
        System.out.println("Descending order based on Model..");
        Comparator<WaterPurifier> comparatorModel1 = new WaterPurifierModelDesc();
        Collections.sort(waterPurifiers, comparatorModel1);
        for (WaterPurifier model : waterPurifiers
        ) {
            System.out.println(model);
        }
        System.out.println("==================================");
        System.out.println("Ascending order based on Capacity..");
        Comparator<WaterPurifier> comparatorCapacity1 = new WaterPurifierCapacityAsc();
        Collections.sort(waterPurifiers, comparatorCapacity1);
        for (WaterPurifier capacity : waterPurifiers
        ) {
            System.out.println(capacity);
        }
        System.out.println("========================================");
        System.out.println("Descending order based on Capacity..");
        Comparator<WaterPurifier> comparatorCapacity = new WaterPurifierCapacityDesc();
        Collections.sort(waterPurifiers, comparatorCapacity);
        for (WaterPurifier capacity1 : waterPurifiers
        ) {
            System.out.println(capacity1);
        }
        System.out.println("========================================");
        System.out.println("Asending order based on purificationTechnology1..");
        Comparator<WaterPurifier> purificationTechnology = new WaterpurificationTechnologyBrandAsc();
        Collections.sort(waterPurifiers, purificationTechnology);
        for (WaterPurifier purifier : waterPurifiers
        ) {
            System.out.println(purifier);
        }
        System.out.println("========================================");
        System.out.println("Descending order based on purificationTechnology..");
        Comparator<WaterPurifier> purificationTechnology1 = new WaterpurificationTechnologyBrandDesc();
        Collections.sort(waterPurifiers, purificationTechnology1);
        for (WaterPurifier purifier : waterPurifiers
        ) {
            System.out.println(purifier);
        }


    }
}
