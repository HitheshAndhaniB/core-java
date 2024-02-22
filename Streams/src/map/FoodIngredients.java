package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FoodIngredients {
    public static void main(String[] args) {
        Map<String,String[]> foodIngredients = new HashMap<>();
        String[] ingredients = {"oil","dairy products","meat","solt","sugar"};

        foodIngredients.put("Chitrana",ingredients);
        foodIngredients.put("Chitrana",ingredients);
        foodIngredients.put("Chitrana",ingredients);
        foodIngredients.put("Chitrana",ingredients);
        foodIngredients.put("Chitrana",ingredients);

        System.out.println("******* list of shirt ********");
        Set<String> keys = foodIngredients.keySet();
        keys.forEach(System.out::println);

        System.out.println("****** list of brands *****");
        Collection<String[]> ingredientsCollection=foodIngredients.values();
        ingredientsCollection.forEach(list-> {
            for (String i : list) {
                System.out.println(i);
            }
        });
    }
}


