package collectionsListTask;

import java.util.Comparator;

public class BeltBrandAse implements Comparator<Belt> {
    @Override
    public int compare(Belt o1, Belt o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getBrand(), o2.getBrand());
    }
}
class BeltBrandDesc implements Comparator<Belt> {
    @Override
    public int compare(Belt o1, Belt o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getBrand(), o1.getBrand());
    }
}
class BeltMeterialAse implements Comparator<Belt> {
    @Override
    public int compare(Belt o1, Belt o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getMaterial(), o2.getMaterial());
    }
}
class BeltmeterialDesc implements Comparator<Belt> {
    @Override
    public int compare(Belt o1, Belt o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getMaterial(), o1.getMaterial());
    }
}
class BeltLengthAsc implements Comparator<Belt> {
    @Override
    public int compare(Belt o1, Belt o2) {
        return Integer.compare(o1.getLength(), o2.getLength());
    }
}
class BeltLengthDesc implements Comparator<Belt> {
    @Override
    public int compare(Belt o1, Belt o2) {
        return Integer.compare(o2.getLength(), o1.getLength());
    }
}
class BeltBuckleTypeAse implements Comparator<Belt> {
    @Override
    public int compare(Belt o1, Belt o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getBuckleType(), o2.getBuckleType());
    }
}
class BeltBuckleTypeDesc implements Comparator<Belt> {
    @Override
    public int compare(Belt o1, Belt o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getBuckleType(), o1.getBuckleType());
    }
}
