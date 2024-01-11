package CollectionsListTask;

import java.util.Comparator;

public class SensorSensitivityDesc implements Comparator<Sensors> {
    @Override
    public int compare(Sensors o1, Sensors o2) {
        return Double.compare(o2.getSensitivity(), o1.getSensitivity());

    }
}
