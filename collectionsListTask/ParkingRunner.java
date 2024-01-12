package collectionsListTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ParkingRunner {
    public static void main(String[] args) {
        Parking parking1 = new Parking("Downtown Garage", 200, 2.50,  "Covered");
        Parking parking2 = new Parking("Street Parking Lot", 50, 1.75,  "Open");
        Parking parking3 = new Parking("Shopping Mall", 300, 3.00,  "Multi-Level");
        Parking parking4 = new Parking("Airport Parking", 500, 5.00,  "Valet");
        Parking parking5 = new Parking("Residential Complex", 100, 1.00,  "Underground");

        List<Parking> list =new ArrayList<>();
        list.add(parking1);
        list.add(parking2);
        list.add(parking3);
        list.add(parking4);
        list.add(parking5);

        System.out.println("Ascending order based on Location..");
        Comparator<Parking> comparatorParking = new ParkingLocationAsc();
        Collections.sort(list, comparatorParking);
        for (Parking parking : list
        ) {
            System.out.println(parking);
        }
        System.out.println("=================================================");
        System.out.println("Ascending order based on Location..");
        Comparator<Parking> comparatorParking1 = new ParkingLocationDesc();
        Collections.sort(list, comparatorParking1);
        for (Parking parkingl : list
        ) {
            System.out.println(parkingl);
        }
        System.out.println("Ascending order based on Capacity..");
        Comparator<Parking> comparatorCapacity= new ParkingCapacityAsc();
        Collections.sort(list, comparatorCapacity);
        for (Parking capacity : list
        ) {
            System.out.println(capacity);
        }
        System.out.println("=================================================");
        System.out.println("Descending order based on Capacity..");
        Comparator<Parking> comparatorCapacity1= new ParkingCapacityDesc();
        Collections.sort(list, comparatorCapacity1);
        for (Parking capacity1 : list
        ) {
            System.out.println(capacity1);
        }

        System.out.println("=================================================");
        System.out.println("Ascending order based on Hoursrate..");
        Comparator<Parking> comparatorRate = new ParkingHoursAsc();
        Collections.sort(list, comparatorRate);
        for (Parking rate : list
        ) {
            System.out.println(rate);
        }
        System.out.println("=================================================");
        System.out.println("Ascending order based on Hoursrate..");
        Comparator<Parking> comparatorRate1 = new ParkingHoursDesc();
        Collections.sort(list, comparatorRate1);
        for (Parking rate1 : list
        ) {
            System.out.println(rate1);
        }
        System.out.println("=================================================");
        System.out.println("Ascending order based on Type..");
        Comparator<Parking> comparatorType = new ParkingTypeAsc();
        Collections.sort(list, comparatorType);
        for (Parking type : list
        ) {
            System.out.println(type);
        }
        System.out.println("=================================================");
        System.out.println("Descending order based on Type..");
        Comparator<Parking> comparatorType1 = new ParkingTypeDesc();
        Collections.sort(list, comparatorType1);
        for (Parking type1 : list
        ) {
            System.out.println(type1);
        }

    }
}
