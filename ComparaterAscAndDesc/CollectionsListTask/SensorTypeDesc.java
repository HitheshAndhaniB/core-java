package CollectionsListTask;

import java.util.Comparator;

public class SensorTypeDesc implements Comparator<Sensors> {
    @Override
    public int compare(Sensors o1, Sensors o2) {
        return o2.getType().compareTo(o1.getType());

    }
}
