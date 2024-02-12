package collectionsListTask;

import java.util.Comparator;

public class SparkPlugGapSizeDesc implements Comparator<SparkPlug> {
    @Override
    public int compare(SparkPlug o1, SparkPlug o2) {
        return Double.compare(o2.getGapSize(), o1.getGapSize());

    }
}
