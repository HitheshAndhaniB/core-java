package CollectionsListTask;

import java.util.Comparator;

public class SpeakerImpedanceAsc implements Comparator<Speaker> {
    @Override
    public int compare(Speaker o1, Speaker o2) {
        return Integer.compare(o1.getImpedance(), o2.getImpedance());

    }
}
