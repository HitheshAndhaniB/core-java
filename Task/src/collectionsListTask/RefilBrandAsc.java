package collectionsListTask;

import java.util.Comparator;

public class RefilBrandAsc implements Comparator<Refill> {
    @Override
    public int compare(Refill o1, Refill o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getBrand(), o2.getBrand());
    }
}
class RefilBrandDesc implements Comparator<Refill> {
    @Override
    public int compare(Refill o1, Refill o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getBrand(), o1.getBrand());
    }
}
class RefilInkColorAsc implements Comparator<Refill> {
    @Override
    public int compare(Refill o1, Refill o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getInkColor(), o2.getInkColor());
    }
}
class RefilInkColorDesc implements Comparator<Refill> {
    @Override
    public int compare(Refill o1, Refill o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getInkColor(), o1.getInkColor());
    }
}
class RefilInkValumeAsc implements Comparator<Refill> {
    @Override
    public int compare(Refill o1, Refill o2) {
        return Double.compare(o1.getInkVolume(), o2.getInkVolume());
    }
}
class RefilInkValumeDesc implements Comparator<Refill> {
    @Override
    public int compare(Refill o1, Refill o2) {
        return Double.compare(o2.getInkVolume(), o1.getInkVolume());
    }
}
class RefilPentypeAsc implements Comparator<Refill> {
    @Override
    public int compare(Refill o1, Refill o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getPenType(), o2.getPenType());
    }
}
class RefilPentypeDesc implements Comparator<Refill> {
    @Override
    public int compare(Refill o1, Refill o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getPenType(), o1.getPenType());
    }
}
