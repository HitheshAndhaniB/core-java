package collectionsListTask;

import java.util.Comparator;

public class SensorRangDesc implements Comparator<Sensors> {

    @Override
    public int compare(Sensors o1, Sensors o2) {
        return Double.compare(o2.getRange(), o1.getRange());

    }
}
