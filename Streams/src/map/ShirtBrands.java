package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShirtBrands {
    public static void main(String[] args) {
        Map<String,String> shirtBrands = new HashMap<>();
        shirtBrands.put("T-Shirt","Allen Solly");
        shirtBrands.put("Hoody","Arrow");
        shirtBrands.put("Jacket","Peter England");
        shirtBrands.put("Tuxedo","Raymond");
        shirtBrands.put("jersey","Van Heusen");

        System.out.println("******* list of shirt ********");
        Set<String> keys = shirtBrands.keySet();
        keys.forEach(System.out::println);

        System.out.println("****** list of brands *****");
        Collection<String> values = shirtBrands.values();
        values.forEach(System.out::println);

    }
}
