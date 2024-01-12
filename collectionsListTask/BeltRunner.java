package collectionsListTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BeltRunner {
    public static void main(String[] args) {
        Belt belt1 = new Belt("Levi's", "Leather", 40, "Pin Buckle");
        Belt belt2 = new Belt("Gucci", "Canvas", 36, "Clasp Buckle");
        Belt belt3 = new Belt("Nike", "Nylon", 42, "Magnetic Buckle");
        Belt belt4 = new Belt("Calvin Klein", "Suede", 38,  "Snap Buckle");
        Belt belt5 = new Belt("Hermes", "Crocodile Leather", 34, "Buckleless");

        List<Belt> list = new ArrayList<>();
        list.add(belt1);
        list.add(belt2);
        list.add(belt3);
        list.add(belt4);
        list.add(belt5);

        System.out.println("Ascending order based on Brand..");
        Comparator<Belt> comparator = new BeltBrandAse();
        Collections.sort(list, comparator);
        for (Belt brand : list
        ) {
            System.out.println(brand);
        }
        System.out.println("=======================================");
        System.out.println("Descending order based on Brand..");
        Comparator<Belt> comparator1= new BeltBrandDesc();
        Collections.sort(list, comparator1);
        for (Belt brand1 : list
        ) {
            System.out.println(brand1);
        }
        System.out.println("=======================================");
        System.out.println("Ascending order based on Meterial..");
        Comparator<Belt> comparatorMaterial = new BeltMeterialAse();
        Collections.sort(list, comparatorMaterial);
        for (Belt meterial : list
        ) {
            System.out.println(meterial);
        }
        System.out.println("========================================");
        System.out.println("Ascending order based on Meterial..");
        Comparator<Belt> comparatorMaterial1 = new BeltmeterialDesc();
        Collections.sort(list, comparatorMaterial1);
        for (Belt meterial1 : list
        ) {
            System.out.println(meterial1);
        }
        System.out.println("========================================");
        System.out.println("Ascending order based on Length..");
        Comparator<Belt> comparatorlength = new BeltLengthAsc();
        Collections.sort(list, comparatorlength);
        for (Belt length : list
        ) {
            System.out.println(length);
        }
        System.out.println("========================================");
        System.out.println("Ascending order based on Length..");
        Comparator<Belt> comparatorlength1 = new BeltLengthDesc();
        Collections.sort(list, comparatorlength1);
        for (Belt length1 : list
        ) {
            System.out.println(length1);
        }
        System.out.println("========================================");
        System.out.println("Ascending order based on BuckleType..");
        Comparator<Belt> comparatorBuckleType = new BeltBuckleTypeAse();
        Collections.sort(list, comparatorBuckleType);
        for (Belt buckleType : list
        ) {
            System.out.println(buckleType);
        }
        System.out.println("========================================");
        System.out.println("Ascending order based on BuckleType..");
        Comparator<Belt> comparatorBuckleType1 = new BeltBuckleTypeDesc();
        Collections.sort(list, comparatorBuckleType1);
        for (Belt buckleType1 : list
        ) {
            System.out.println(buckleType1);
        }
    }
}
