package map;

import java.util.*;

public class LandOwner {
    public static void main(String[] args) {
        Map<String,String> landOwner = new HashMap<>();
        landOwner.put("own land","Hithesh");
        landOwner.put("Rented land","Kiran");
        landOwner.put("Tenency land","Madhu");
        landOwner.put("Dry land","anil");

        System.out.println(" **** list of land ****");
        Set<String> keys = landOwner.keySet();
        keys.forEach(System.out::println);

        System.out.println("****** list of values ******");
        Collection<String> values = landOwner.values();
        values.forEach(System.out::println);



    }
}
