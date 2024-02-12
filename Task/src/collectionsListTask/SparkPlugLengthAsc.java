package collectionsListTask;

import java.util.Comparator;

public class SparkPlugLengthAsc implements Comparator<SparkPlug> {
    @Override
    public int compare(SparkPlug o1, SparkPlug o2) {
        return Double.compare(o1.getLength(), o2.getLength());

    }
}
