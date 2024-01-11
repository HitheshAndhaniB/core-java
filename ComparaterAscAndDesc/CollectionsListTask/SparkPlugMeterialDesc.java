package CollectionsListTask;

import java.util.Comparator;

public class SparkPlugMeterialDesc implements Comparator<SparkPlug> {
    @Override
    public int compare(SparkPlug o1, SparkPlug o2) {
        return o2.getMaterial().compareTo(o1.getMaterial());

    }
}
