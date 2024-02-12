package collectionsListTask;

import java.util.Comparator;

public class SparkplugLengthDesc implements Comparator<SparkPlug> {
    @Override
    public int compare(SparkPlug o1, SparkPlug o2) {
        return Double.compare(o2.getLength(), o1.getLength());

    }
}
