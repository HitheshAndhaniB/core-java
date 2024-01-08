package Collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RadioStation {
    public static void main(String[] args) {
        Collection<String> radio = new ArrayList<>();
        radio.add("Animal");
        radio.add("wilde");
        radio.add("Small");
        radio.add("Big");
        radio.add("Birds");
        Iterator<String> ref = radio.iterator();
        while (ref.hasNext()){
            String val=ref.next();
            if (val.startsWith("w")){
                System.out.println(val);
            }
            else {
                System.out.println("not ends with");
            }
        }
    }
}
