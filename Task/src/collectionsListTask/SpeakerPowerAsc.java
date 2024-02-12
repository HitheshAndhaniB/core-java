package collectionsListTask;

import java.util.Comparator;

public class SpeakerPowerAsc implements Comparator<Speaker> {
    @Override
    public int compare(Speaker o1, Speaker o2) {
        return Integer.compare(o1.getPower(), o2.getPower());

    }
}
