package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionMethods {
    public static void main(String[] args) {
        Collection<String> ref = new ArrayList<String>();
        ref.add("Mango");
        ref.add("Banana");
        ref.add("Orange");
        System.out.println("Creating the ref"+ref);

        Collection<String> ref1 = new ArrayList<String>();
        ref1.add("1");
        ref1.add("2");
        ref1.add("3");
        System.out.println(ref1);

        boolean value = ref.isEmpty();
        System.out.println(value);
        System.out.println("****************************");

        int value1 = ref.size();
        System.out.println(value1);
        System.out.println("****************************");

        boolean value2 = ref.equals(ref);
        System.out.println(value2);
        System.out.println("****************************");

        boolean contains = ref.contains("Apple");
        System.out.println(contains);
        System.out.println("*****************************");

        boolean value4 = Collections.addAll(ref,"Apple","Grapes");
        System.out.println(value4);
        System.out.println(ref);
        System.out.println("******************************");

        boolean remove = ref.removeAll(ref);
        System.out.println(remove);
        System.out.println(ref);
        System.out.println("******************************");

        boolean containsAll = ref.containsAll(ref);
        System.out.println(containsAll);
        System.out.println("*******************");

        ref.addAll(ref1);
        for (String e : ref) {
            System.out.println(e);
        }
        System.out.println(ref);


        boolean retain = ref.retainAll(ref1);
        for (String e : ref1){
            System.out.println(e);
        }
        System.out.println(retain);
        System.out.println(ref);
        System.out.println("******************************");

        Object[] array = ref.toArray();
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
        }

    }
}
