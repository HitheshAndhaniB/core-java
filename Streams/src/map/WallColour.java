package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WallColour {
    public static void main(String[] args) {
        Map<String,String> wallColor = new HashMap<>();
        wallColor.put("room","blue");
        wallColor.put("Bed room","red");
        wallColor.put("kitcen","brown");
        wallColor.put("Store room","black");
        wallColor.put("living room","white");

        System.out.println("*** list of walls ****");
        Set<String> keys = wallColor.keySet();
        keys.forEach(System.out::println);

        System.out.println("****** list of colour ********");
        Collection<String> values = wallColor.values();
        values.forEach(System.out::println);

    }
}
