package Comparater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Toll {
    public static void main(String[] args) {
        Comparator<Double> toll = new TollImpl();
        List<Double> tollList = new ArrayList<>();
        System.out.println("Asending order list");
        tollList.add(220.00);
        tollList.add(260.00);
        tollList.add(340.00);
        tollList.add(420.00);
        tollList.add(400.00);
        tollList.add(280.00);
        tollList.add(180.00);
        tollList.add(150.00);
        tollList.add(210.00);
        tollList.add(200.00);

        Collections.sort(tollList);
        for (Double i :tollList)
        {
            System.out.println(i);
        }
        System.out.println("***************************");
        System.out.println("Desending order list");
        Collections.sort(tollList,toll);
        for (Double i :tollList)
        {
            System.out.println(i);
        }
    }
}
