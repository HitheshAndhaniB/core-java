package collectionsListTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RefilRunner {
    public static void main(String[] args) {
        Refill refill1 = new Refill("Parker", "Blue", 10.5,  "Ballpoint");
        Refill refill2 = new Refill("Lamy", "Black", 8.2, "Rollerball");
        Refill refill3 = new Refill("Mont Blanc", "Green", 12.0, "Fountain");
        Refill refill4 = new Refill("Pilot", "Red", 9.8,  "Gel");
        Refill refill5 = new Refill("Cross", "Purple", 11.3,  "Ballpoint");

        List<Refill> refill = new ArrayList<>();
        refill.add(refill1);
        refill.add(refill2);
        refill.add(refill3);
        refill.add(refill4);
        refill.add(refill5);

        System.out.println("Ascending order based on Brand..");
        Comparator<Refill> comparatorBrand = new RefilBrandAsc();
        Collections.sort(refill, comparatorBrand);
        for (Refill brand : refill
        ) {
            System.out.println(brand);
        }
        System.out.println("==================================");
        System.out.println("Ascending order based on Brand..");
        Comparator<Refill> comparatorBrand1 = new RefilBrandDesc();
        Collections.sort(refill, comparatorBrand1);
        for (Refill brand : refill
        ) {
            System.out.println(brand);
        }
        System.out.println("==================================");
        System.out.println("Ascending order based on InkColor..");
        Comparator<Refill> comparatorInkColor = new RefilInkColorAsc();
        Collections.sort(refill, comparatorInkColor);
        for (Refill inkcolor : refill
        ) {
            System.out.println(inkcolor);
        }
        System.out.println("==================================");
        System.out.println("Descending order based on InkColor..");
        Comparator<Refill> comparatorInkColor1 = new RefilInkColorDesc();
        Collections.sort(refill, comparatorInkColor1);
        for (Refill inkcolor : refill
        ) {
            System.out.println(inkcolor);
        }
        System.out.println("==================================");
        System.out.println("Ascending order based on InkVolume..");
        Comparator<Refill> comparatorInkVolume = new RefilInkValumeAsc();
        Collections.sort(refill, comparatorInkVolume);
        for (Refill inkVolume : refill
        ) {
            System.out.println(inkVolume);
        }
        System.out.println("==================================");
        System.out.println("Descending order based on InkVolume..");
        Comparator<Refill> comparatorInkVolume1 = new RefilInkValumeDesc();
        Collections.sort(refill, comparatorInkVolume1);
        for (Refill inkVolume : refill
        ) {
            System.out.println(inkVolume);
        }
        System.out.println("==================================");
        System.out.println("Ascending order based on PenType..");
        Comparator<Refill> comparatorPenType = new RefilPentypeAsc();
        Collections.sort(refill, comparatorPenType);
        for (Refill pentype : refill
        ) {
            System.out.println(pentype);
        }
        System.out.println("==================================");
        System.out.println("Ascending order based on PenType..");
        Comparator<Refill> comparatorPenType1 = new RefilPentypeDesc();
        Collections.sort(refill, comparatorPenType1);
        for (Refill pentype : refill
        ) {
            System.out.println(pentype);
        }


    }
}
