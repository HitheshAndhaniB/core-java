package listIterator;

import java.util.*;

public class ShoeBrands {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Nike");
        list.add("Reebok");
        list.add("Puma");
        list.add("Converse");
        list.add("Vans");
        list.add("New Balance");
        list.add("Timberland");
        list.add("Dr. Martens");
        list.add("Skechers");
        list.add("Adidas");

        ListIterator listIterator = list.listIterator();

        System.out.println("----------Forword Direction----------");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("----------Backword Direction---------");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        ListIterator listIterator1 = list.listIterator(4);
        System.out.println("--------Using index in Forword Direction---------");
        while (listIterator1.hasNext()){
            System.out.println(listIterator1.next());
        }
        ListIterator listIterator2= list.listIterator(4);

        System.out.println("-------using index in Backword Direction------");
        while (listIterator2.hasPrevious()){
            System.out.println(listIterator2.previous());
        }


        System.out.println("-----Removing elements-----");
        ListIterator<String> listIterator3=list.listIterator();

        while (listIterator3.hasNext())
        {
            String shoes= listIterator3.next();
            if (shoes.equals("Nike"))
            {
                listIterator3.remove();
            }
        }
        list.forEach(l-> System.out.println(l));

        ListIterator<String> listIterator4 = list.listIterator();
        System.out.println("-----Adding elements-----");
        while (listIterator4.hasNext()){
            String shoe = listIterator4.next();
            if (shoe.equals("Vans")){
                listIterator4.add("Gucchi");
            }
        }
        list.forEach(s-> System.out.println(s));

        System.out.println("------Sorting elements in Decending-------");
        Collections.sort(list,Collections.reverseOrder());
        list.forEach(s-> System.out.println(s));



    }
}
