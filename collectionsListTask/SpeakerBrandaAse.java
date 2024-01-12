package collectionsListTask;

import java.util.Comparator;

public class SpeakerBrandaAse implements Comparator<Speaker> {
    public int compare(Speaker o1, Speaker o2) {
        // TODO Auto-generated method stub
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
