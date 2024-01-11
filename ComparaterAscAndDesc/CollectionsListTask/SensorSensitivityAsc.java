package CollectionsListTask;

import java.util.Comparator;

public class SensorSensitivityAsc implements Comparator<Sensors> {
    @Override
    public int compare(Sensors o1, Sensors o2) {
        // TODO Auto-generated method stub
        return Double.compare(o1.getSensitivity(), o2.getSensitivity());
    }
}
