package CollectionsListTask;

import java.util.Comparator;

public class SparkPlugGapSizeAsc implements Comparator<SparkPlug> {

    @Override
    public int compare(SparkPlug o1, SparkPlug o2) {
        return Double.compare(o1.getGapSize(), o2.getGapSize());

    }
}
