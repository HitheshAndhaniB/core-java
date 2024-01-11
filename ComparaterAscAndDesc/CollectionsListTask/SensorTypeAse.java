package CollectionsListTask;

import java.util.Comparator;

public class SensorTypeAse implements Comparator<Sensors> {

    @Override
    public int compare(Sensors o1, Sensors o2) {
        // TODO Auto-generated method stub
        return o1.getType().compareTo(o2.getType());
    }
}
