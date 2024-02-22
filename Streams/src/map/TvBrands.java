package map;

import java.util.*;

public class TvBrands {
    public static void main(String[] args) {
        Map<String,String> tvBrands = new HashMap<>();
        tvBrands.put("Led","Sunsui");
        tvBrands.put("Lcd","Lg");
        tvBrands.put("4k","onida");
        tvBrands.put("4k","sumsong");
        tvBrands.put("Led","Vxi");

        System.out.println("****** list of keys ****");
        Set<String> keys = tvBrands.keySet();
        keys.forEach(System.out::println);

        System.out.println("********* list of values ******");
        Collection<String> values = tvBrands.values();
        values.forEach(System.out::println);


    }
}
