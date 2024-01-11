package CollectionsListTask;

import java.util.Comparator;

public class SensorNameDesc implements Comparator<Sensors> {

    @Override
    public int compare(Sensors o1, Sensors o2) {
        return o2.getName().compareTo(o1.getName());

    }
}
