package CollectionsListTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SparkPlugRunner {
    public static void main(String[] args) {
        SparkPlug sparkPlug1 = new SparkPlug("SparkPlug1", "Platinum", 45.0, 0.8);
        SparkPlug sparkPlug2 = new SparkPlug("SparkPlug2", "Iridium", 50.0, 0.6);
        SparkPlug sparkPlug3 = new SparkPlug("SparkPlug3", "Copper", 40.0, 1.0);
        SparkPlug sparkPlug4 = new SparkPlug("SparkPlug4", "Silver", 48.0, 0.7);
        SparkPlug sparkPlug5 = new SparkPlug("SparkPlug5", "Nickel", 42.0, 0.9);

        List<SparkPlug> list = new ArrayList<>();
        list.add(sparkPlug1);
        list.add(sparkPlug2);
        list.add(sparkPlug3);
        list.add(sparkPlug4);
        list.add(sparkPlug5);

        Comparator<SparkPlug> comparatorNameAsc = new SparkPlugGapSizeAsc();
        Collections.sort(list, comparatorNameAsc);
        System.out.println("after sorting name in ascending order");
        for (SparkPlug name : list) {
            System.out.println(name);
        }
        System.out.println("======================================================");

        Comparator<SparkPlug> comparatorNameDesc = new SparkPlugnameDesc();
        Collections.sort(list, comparatorNameDesc);
        System.out.println("after sorting name in descending order");
        for (SparkPlug name : list) {
            System.out.println(name);
        }
        System.out.println("=======================================================");
        Comparator<SparkPlug> comparatorMeterialAsc = new SparkPlugMaterialAsc();
        Collections.sort(list, comparatorMeterialAsc);
        System.out.println("after sorting Meterialname in ascending order");
        for (SparkPlug meterial : list) {
            System.out.println(meterial);
        }
        System.out.println("======================================================");

        Comparator<SparkPlug> comparatorMeterialDesc = new SparkPlugMeterialDesc();
        Collections.sort(list, comparatorMeterialDesc);
        System.out.println("after sorting Meterialname in descending order");
        for (SparkPlug meterial : list) {
            System.out.println(meterial);
        }
        System.out.println("=======================================================");
        Comparator<SparkPlug> comparatorLengthAsc = new SparkPlugMaterialAsc();
        Collections.sort(list, comparatorLengthAsc);
        System.out.println("after sorting Length in ascending order");
        for (SparkPlug length : list) {
            System.out.println(length);
        }
        System.out.println("======================================================");

        Comparator<SparkPlug> comparatorLengthDesc = new SparkPlugMeterialDesc();
        Collections.sort(list, comparatorLengthDesc);
        System.out.println("after sorting length in descending order");
        for (SparkPlug length : list) {
            System.out.println(length);
        }

        System.out.println("=======================================================");
        Comparator<SparkPlug> comparatorGapSizeAsc = new SparkPlugGapSizeAsc();
        Collections.sort(list, comparatorGapSizeAsc);
        System.out.println("after sorting gapSize in ascending order");
        for (SparkPlug gapSize : list) {
            System.out.println(gapSize);
        }
        System.out.println("======================================================");

        Comparator<SparkPlug> comparatorGapSizeDesc = new SparkPlugGapSizeDesc();
        Collections.sort(list, comparatorGapSizeDesc);
        System.out.println("after sorting gapSize in descending order");
        for (SparkPlug gapSize : list) {
            System.out.println(gapSize);
        }
    }
}

