package CollectionsListTask;

import java.util.Comparator;

public class SpeakerBrandDesc implements Comparator<Speaker> {
    @Override
    public int compare(Speaker o1, Speaker o2) {
        return o2.getBrand().compareTo(o1.getBrand());

    }
}
