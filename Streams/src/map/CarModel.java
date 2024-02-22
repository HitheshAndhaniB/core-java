package map;

import java.util.*;

public class CarModel {
    public static void main(String[] args) {
        Map<String,Integer> carModel = new HashMap<>();
        carModel.put("Teslva",2019);
        carModel.put("Volvo",2019);
        carModel.put("Volkswagen",2018);
        carModel.put("Mercedes",2017);
        carModel.put("Tata",2020);

        System.out.println("**** list of keys *****");
        Set<String> keys = carModel.keySet();
        keys.forEach(System.out::println);

        System.out.println("******* list of values *****");
          Collection<Integer> values = carModel.values();
          values.forEach(System.out::println);

    }

}
