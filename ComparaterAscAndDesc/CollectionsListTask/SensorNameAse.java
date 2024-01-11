package CollectionsListTask;

import java.util.Comparator;

public class SensorNameAse implements Comparator<Sensors> {

    @Override
    public int compare(Sensors o1, Sensors o2) {
        // TODO Auto-generated method stub
        return o1.getName().compareTo(o2.getName());
    }
}
