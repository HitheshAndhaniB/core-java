package collectionsListTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SpeakerRunner {
    public static void main(String[] args) {
    Speaker speaker1 = new Speaker("Sony", 100, 8, 90);
    Speaker speaker2 = new Speaker("Bose", 150, 6, 88);
    Speaker speaker3 = new Speaker("JBL", 120, 4, 85);
    Speaker speaker4 = new Speaker("Harman Kardon", 110, 8, 92);
    Speaker speaker5 = new Speaker("Logitech", 80, 16, 86);
        List<Speaker> list = new ArrayList<>();
        list.add(speaker1);
        list.add(speaker2);
        list.add(speaker3);
        list.add(speaker4);
        list.add(speaker5);

        Comparator<Speaker> BrandAsc = new SpeakerBrandaAse();
        Collections.sort(list, BrandAsc);
        System.out.println("after sorting brandname in ascending order");
        for (Speaker brand : list) {
            System.out.println(brand);
        }
        System.out.println("======================================================");

        Comparator<Speaker> BrandDesc = new SpeakerBrandDesc();
        Collections.sort(list, BrandDesc);
        System.out.println("after sorting brandname in descending order");
        for (Speaker brand : list) {
            System.out.println(brand);
        }
        System.out.println("=======================================================");
        Comparator<Speaker> IndependecAsc = new SpeakerImpedanceAsc();
        Collections.sort(list, IndependecAsc);
        System.out.println("after sorting Independecdesc in ascending order");
        for (Speaker independence : list) {
            System.out.println(independence);
        }
        System.out.println("======================================================");

        Comparator<Speaker> Independecdesc = new SpeakerImpedanceDesc();
        Collections.sort(list, Independecdesc);
        System.out.println("after sorting Independecdesc in descending order");
        for (Speaker independence : list) {
            System.out.println(independence);
        }
        System.out.println("=======================================================");
        Comparator<Speaker> PowerAsc = new SpeakerPowerAsc();
        Collections.sort(list, PowerAsc);
        System.out.println("after sorting Independecdesc in ascending order");
        for (Speaker powerAsc : list) {
            System.out.println(powerAsc);
        }
        System.out.println("======================================================");

        Comparator<Speaker> Powerdesc = new SpeakerPowerDesc();
        Collections.sort(list, Powerdesc);
        System.out.println("after sorting Independecdesc in descending order");
        for (Speaker powerdesc : list) {
            System.out.println(powerdesc);
        }




}
}
