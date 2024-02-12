package collectionsListTask;

import java.util.Comparator;

public class SparkPlugnameDesc implements Comparator<SparkPlug> {
    @Override
    public int compare(SparkPlug o1, SparkPlug o2) {
        return o2.getName().compareTo(o1.getName());

    }
}
