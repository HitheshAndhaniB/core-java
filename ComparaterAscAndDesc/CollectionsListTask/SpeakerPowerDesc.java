package CollectionsListTask;

import java.util.Comparator;

public class SpeakerPowerDesc implements Comparator<Speaker> {
    @Override
    public int compare(Speaker o1, Speaker o2) {
        return Integer.compare(o2.getPower(), o1.getPower());

    }
}
