package Comparater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Oceans {
    public static void main(String[] args) {
        Comparator<String> oceans = new SeedsComparaterImpl();
        List<String> oceanList = new ArrayList<>();
        System.out.println("Asending order list");
        oceanList.add("Pacific Ocean");
        oceanList.add("Atlantic Ocean");
        oceanList.add("Indian Ocean");
        oceanList.add("Southern Ocean");
        oceanList.add("Arctic Ocean");
        oceanList.add("Antarctic Ocean");
        oceanList.add("North Atlantic Ocean");
        oceanList.add("South Atlantic Ocean");
        oceanList.add("North Pacific Ocean");
        oceanList.add("South Pacific Ocean");
        Collections.sort(oceanList);
        for (String i :oceanList)
              {
                  System.out.println(i);
              }
        System.out.println("***************************");
        System.out.println("Desending order list");
        Collections.sort(oceanList,oceans);
        for (String i :oceanList)
              {
                  System.out.println(i);
              }
    }
}
