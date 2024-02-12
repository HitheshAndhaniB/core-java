package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;

public class methods {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(10);
        collection.add(20);
        collection.add(30);
        collection.add(40);
        System.out.println(collection);

        Collection<Integer> collection1 = new ArrayList<>();
        collection1.add(1);
        collection1.add(2);
        collection1.add(3);
        collection1.add(4);
        System.out.println(collection1);

        collection.addAll(collection1);
        System.out.println("addAll"+collection);

       boolean remove= collection.removeAll(collection1);
        System.out.println("removeAll "+remove);
        System.out.println(collection);

    }
}
