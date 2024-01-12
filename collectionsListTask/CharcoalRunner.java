package collectionsListTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CharcoalRunner {
    public static void main(String[] args) {
        Charcoal charcoal1 = new Charcoal("Kingsford", "Briquettes", 4.5, "Grilling");
        Charcoal charcoal2 = new Charcoal("Royal Oak", "Lump", 3.2, "Smoking");
        Charcoal charcoal3 = new Charcoal("Weber", "Instant", 2.0,  "Quick Grilling");
        Charcoal charcoal4 = new Charcoal("Jealous Devil", "Hardwood", 5.0,  "High Heat");
        Charcoal charcoal5 = new Charcoal("Cowboy", "Mesquite", 6.5,  "Barbecue");

        List<Charcoal> list = new ArrayList<>();
        list.add(charcoal1);
        list.add(charcoal2);
        list.add(charcoal3);
        list.add(charcoal4);
        list.add(charcoal5);

        System.out.println("Ascending order based on Brand..");
        Comparator<Charcoal> comparator = new CharcoalBrandAsc();
        Collections.sort(list, comparator);
        for (Charcoal brand : list
        ) {
            System.out.println(brand);
        }
        System.out.println("=====================================");
        System.out.println("Decending order based on Brand..");
        Comparator<Charcoal> comparator1 = new CharcoalBrandDesc();
        Collections.sort(list, comparator1);
        for (Charcoal brand1 : list
        ) {
            System.out.println(brand1);
        }
        System.out.println("======================================");
        System.out.println("Ascending order based on type..");
        Comparator<Charcoal> comparatortype = new CharcoalTypeAsc();
        Collections.sort(list, comparatortype);
        for (Charcoal type : list
        ) {
            System.out.println(type);
        }
        System.out.println("======================================");
        System.out.println("descending order based on type..");
        Comparator<Charcoal> comparatortype1 = new CharcoalTypeDesc();
        Collections.sort(list, comparatortype1);
        for (Charcoal type1 : list
        ) {
            System.out.println(type1);
        }
        System.out.println("======================================");
        System.out.println("Ascending order based on Weight..");
        Comparator<Charcoal> comparatorWeight = new CharcoalWeightAsc();
        Collections.sort(list, comparatorWeight);
        for (Charcoal weight : list
        ) {
            System.out.println(weight);
        }
        System.out.println("======================================");
        System.out.println("descending order based on weight..");
        Comparator<Charcoal> comparatorWeight1 = new CharcoalWeightDesc();
        Collections.sort(list, comparatorWeight1);
        for (Charcoal weight1 : list
        ) {
            System.out.println(weight1);
        }System.out.println("======================================");
        System.out.println("Ascending order based on Purpose..");
        Comparator<Charcoal> comparatorPurpose = new CharcoalPurposeAsc();
        Collections.sort(list, comparatorPurpose);
        for (Charcoal purpose : list
        ) {
            System.out.println(purpose);
        }
        System.out.println("======================================");
        System.out.println("descending order based on Purpose..");
        Comparator<Charcoal> comparatorPurpose1 = new CharcoalPurposeDesc();
        Collections.sort(list, comparatorPurpose1);
        for (Charcoal purpose1 : list
        ) {
            System.out.println(purpose1);
        }



    }
}
