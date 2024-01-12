package collectionsListTask;

import java.util.Comparator;

public class ParkingLocationAsc implements Comparator<Parking> {
    @Override
    public int compare(Parking o1, Parking o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getLocation(), o2.getLocation());
    }
}
class ParkingLocationDesc implements Comparator<Parking> {
    @Override
    public int compare(Parking o1, Parking o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getLocation(), o1.getLocation());
    }
}
class ParkingCapacityAsc implements Comparator<Parking> {
    @Override
    public int compare(Parking o1, Parking o2) {
        return Double.compare(o1.getHourlyRate(), o2.getHourlyRate());
    }
}
class ParkingCapacityDesc implements Comparator<Parking> {
    @Override
    public int compare(Parking o1, Parking o2) {
        return Double.compare(o2.getHourlyRate(), o1.getHourlyRate());
    }
}
class ParkingHoursAsc implements Comparator<Parking> {
    @Override
    public int compare(Parking o1, Parking o2) {
        return Double.compare(o1.getHourlyRate(), o2.getHourlyRate());
    }
}
class ParkingHoursDesc implements Comparator<Parking> {
    @Override
    public int compare(Parking o1, Parking o2) {
        return Double.compare(o2.getHourlyRate(), o1.getHourlyRate());
    }
}
class ParkingTypeAsc implements Comparator<Parking> {
    @Override
    public int compare(Parking o1, Parking o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getType(), o2.getType());
    }
}
class ParkingTypeDesc implements Comparator<Parking> {
    @Override
    public int compare(Parking o1, Parking o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getType(), o1.getType());
    }
}
