package collectionsListTask;

import java.util.Comparator;

public class WaterPurifierBrandAsc implements Comparator<WaterPurifier> {
        @Override
        public int compare(WaterPurifier o1, WaterPurifier o2) {
            return String.CASE_INSENSITIVE_ORDER.compare(o1.getBrand(), o2.getBrand());
        }
    }

class WaterPurifierBrandDesc implements Comparator<WaterPurifier> {
        @Override
        public int compare(WaterPurifier o1, WaterPurifier o2) {
            return String.CASE_INSENSITIVE_ORDER.compare(o2.getBrand(), o1.getBrand());
        }
    }
class WaterPurifierModelAsc implements Comparator<WaterPurifier> {
    @Override
    public int compare(WaterPurifier o1, WaterPurifier o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getModel(), o2.getModel());
    }
}class WaterPurifierModelDesc implements Comparator<WaterPurifier> {
    @Override
    public int compare(WaterPurifier o1, WaterPurifier o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getModel(), o1.getModel());
    }
}
class WaterPurifierCapacityAsc implements Comparator<WaterPurifier> {
    @Override
    public int compare(WaterPurifier o1, WaterPurifier o2) {
        return Double.compare(o1.getCapacity(), o2.getCapacity());
    }
}class WaterPurifierCapacityDesc implements Comparator<WaterPurifier> {
    @Override
    public int compare(WaterPurifier o1, WaterPurifier o2) {
        return Double.compare(o2.getCapacity(), o1.getCapacity());
    }
}

class WaterpurificationTechnologyBrandAsc implements Comparator<WaterPurifier> {
    @Override
    public int compare(WaterPurifier o1, WaterPurifier o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getPurificationTechnology(), o2.getPurificationTechnology());
    }
}class WaterpurificationTechnologyBrandDesc implements Comparator<WaterPurifier> {
    @Override
    public int compare(WaterPurifier o1, WaterPurifier o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getPurificationTechnology(), o1.getPurificationTechnology());
    }
}


