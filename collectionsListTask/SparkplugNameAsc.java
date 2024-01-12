package collectionsListTask;

import java.util.Comparator;

public class SparkplugNameAsc implements Comparator<SparkPlug> {

    public int compare(SparkPlug o1, SparkPlug o2) {
        // TODO Auto-generated method stub
        return o1.getName().compareTo(o2.getName());
    }
}
