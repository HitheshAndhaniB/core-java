package collectionsListTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CoverRunner {
    public static void main(String[] args) {
        Cover cover1 = new Cover("Cotton", "Blue", 16,  "Stripes");
        Cover cover2 = new Cover("Polyester", "Red", 18,  "Floral");
        Cover cover3 = new Cover("Leather", "Brown", 14, "Plain");
        Cover cover4 = new Cover("Nylon", "Black", 20,  "Geometric");
        Cover cover5 = new Cover("Canvas", "Green", 12,  "Abstract");

        List<Cover> list = new ArrayList<>();
        list.add(cover1);
        list.add(cover2);
        list.add(cover3);
        list.add(cover4);
        list.add(cover5);

        System.out.println("Ascending order based on Meterial..");
        Comparator<Cover> comparator = new CoverMaterialAsc();
        Collections.sort(list, comparator);
        for (Cover meterial : list
        ) {
            System.out.println(meterial);
        }
        System.out.println("===========================================");
        System.out.println("Descending order based on Meterial..");
        Comparator<Cover> comparator1 = new CoverMaterialDesc();
        Collections.sort(list, comparator1);
        for (Cover meterial1 : list
        ) {
            System.out.println(meterial1);
        }
        System.out.println("===========================================");
        System.out.println("Ascending order based on Color..");
        Comparator<Cover> comparatorcolor1 = new CoverColorAsc();
        Collections.sort(list, comparatorcolor1);
        for (Cover color1 : list
        ) {
            System.out.println(color1);
        }
        System.out.println("===========================================");

        System.out.println("Descending order based on Color..");
        Comparator<Cover> comparatorcolor = new CoverDesinDesc();
        Collections.sort(list, comparatorcolor);
        for (Cover color : list
        ) {
            System.out.println(color);
        }
        System.out.println("===========================================");
        System.out.println("Ascending order based on Size..");
        Comparator<Cover> comparatorSize = new CoverSizeAsc();
        Collections.sort(list, comparatorSize);
        for (Cover size : list
        ) {
            System.out.println(size);
        }
        System.out.println("===========================================");
        System.out.println("Descending order based on Size..");
        Comparator<Cover> comparatorSize1 = new CoverSizeDesc();
        Collections.sort(list, comparatorSize1);
        for (Cover size1 : list
        ) {
            System.out.println(size1);
        }
        System.out.println("===========================================");
        System.out.println("Ascending order based on Design..");
        Comparator<Cover> comparatorDesign = new CoverDesinAsc();
        Collections.sort(list, comparatorDesign);
        for (Cover design : list
        ) {
            System.out.println(design);
        }
        System.out.println("===========================================");
        System.out.println("Descending order based on Design..");
        Comparator<Cover> comparatorDesign1 = new CoverDesinDesc();
        Collections.sort(list, comparatorDesign1);
        for (Cover design1 : list
        ) {
            System.out.println(design1);
        }


    }
}
