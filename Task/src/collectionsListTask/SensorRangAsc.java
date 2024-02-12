package collectionsListTask;

import java.util.Comparator;

public class SensorRangAsc implements Comparator<Sensors> {
    @Override
    public int compare(Sensors o1, Sensors o2) {
        return Double.compare(o1.getRange(), o2.getRange());

    }
}
