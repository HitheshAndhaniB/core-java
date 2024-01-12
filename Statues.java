package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Statues {
    public static void main(String[] args) {
        Collection<String> statues = new ArrayList<>();
        statues.add("1.Statue of Unity");
        statues.add("2.Taj Mahal");
        statues.add("3.Gateway of India");
        statues.add("4.India Gate");
        statues.add("5.Qutub Minar");
        statues.add("6.Sri Ranganathaswamy Temple ");
        statues.add("7.Golden Temple");
        statues.add("8.Victoria Memorial");
        statues.add("9.Jagannath Temple");
        statues.add("10.Brihadeeswarar Temple");
        statues.add("11.Elephanta Caves");
        statues.add("12.Bahubali Statue");
        statues.add("13.Mysore Palace");
        statues.add("14.Charminar");
        statues.add("15.Hampi");
        statues.add("16.Sanchi Stupa -");
        statues.add("17.Sardar Patel Memorial");
        statues.add("18.Adiyogi Shiva Statue ");
        statues.add("19.Chhatrapati Shivaji Maharaj Statue ");
        statues.add("20.Gomateshwara Bahubali Statue");
        statues.add("21.Statue of Liberty");
        statues.add("22.Christ the Redeemer ");
        statues.add("23.The Thinker ");
        statues.add("24.Venus de Milo");
        statues.add("25.Moai statues ");
        statues.add("26.Terracotta Army");
        statues.add("27.The Discus Thrower");
        statues.add("28.David - Galleria dell'Accademia");
        statues.add("29.The Motherland Calls");
        statues.add("30.Nelson's Column");
        statues.add("31.The Golden Buddha");
        statues.add("32.The Tian Tan Buddha ");
        statues.add("33.The Sphinx of Naxos");
        statues.add("34.King Sejong the Great");
        statues.add("35.The Magdeburg Ride");
        statues.add("36.The Great Sphinx of Giza");
        statues.add("37.Statue of Qin Shi Huang");
        statues.add("38.The Ecstasy of Saint Teresa ");
        statues.add("39.The Hachikō Statue ");
        statues.add("40.The Bremen Roland");
        Iterator<String> ref =statues.iterator();
        while (ref.hasNext()) {
            String name = ref.next();
            if (name.endsWith("r")) {
                System.out.println(name);
            }
        }
        }
}

