package collectionsListTask;

import java.util.Comparator;

public class SparkPlugMaterialAsc implements Comparator<SparkPlug> {
    public int compare(SparkPlug o1, SparkPlug o2) {
        // TODO Auto-generated method stub
        return o1.getMaterial().compareTo(o2.getMaterial());
    }
}

