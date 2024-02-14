package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CampingItems {
    public static void main(String[] args) {
        
        List<String> compingItems = new ArrayList<>();
        compingItems.add("Tent");
        compingItems.add("Sleeping bag");
        compingItems.add("Camp stove");
        compingItems.add("Cooking utensils");
        compingItems.add("Flashlight");
        compingItems.add("Water bottle");
        compingItems.add("Hiking boots");
        compingItems.add("First aid kit");
        compingItems.add("Map and compass");
        compingItems.add("Backpack");

        System.out.println("---Items having T---");
        compingItems.stream().filter(ref->ref.contains("t")).forEach(t-> System.out.println(t));

        System.out.println("----Sorting items in Desending Order----");
        compingItems.stream().sorted(Collections.reverseOrder()).forEach(t1-> System.out.println(t1));

        System.out.println("-------Items which as 5 characters and sort in desecending----- ");
        compingItems.stream().filter(ref2->ref2.length()<=5).sorted(Collections.reverseOrder()).forEach(t2-> System.out.println(t2));

        System.out.println("-----Convert items to uppercase and filter only which as A----");
        List<String> list1 = compingItems.stream().filter(ref3->ref3.contains("a")).collect(Collectors.toList());
        list1.forEach(t5-> System.out.println(t5));

        System.out.println("-----Items has t print and count-----");
        long list4 = compingItems.stream().filter(ref4->ref4.contains("t")).count();
        System.out.println(list4);

        System.out.println("------Items has a and o collect and sort in Asending-----");
        compingItems.stream().filter(ref5->ref5.contains("a")&&ref5.contains("o")).sorted().forEach(t6-> System.out.println(t6));

    }
}
