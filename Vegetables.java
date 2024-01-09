package Comparater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Vegetables {
    public static void main(String[] args) {
        Comparator<String> vegetables = new SeedsComparaterImpl();
        List<String> vegetablesList = new ArrayList<>();
        System.out.println("Asending order list");
        vegetablesList.add("Carrot");
        vegetablesList.add("Broccoli");
        vegetablesList.add("Tomato");
        vegetablesList.add("Spinach");
        vegetablesList.add("Bell pepper");
        vegetablesList.add("Cucumber");
        vegetablesList.add("Potato");
        vegetablesList.add("Cauliflower");
        vegetablesList.add("Eggplant");
        vegetablesList.add("Onion");
        Collections.sort(vegetablesList);
        for (String i :vegetablesList)
        {
            System.out.println(i);
        }
        System.out.println("***************************");
        System.out.println("Desending order list");
        Collections.sort(vegetablesList,vegetables);
        for (String i :vegetablesList)
        {
            System.out.println(i);
        }
    }

    }

