package CollectionsListTask;

import java.util.Comparator;

public class SpeakerImpedanceDesc implements Comparator<Speaker> {
    @Override
    public int compare(Speaker o1, Speaker o2) {
        return Integer.compare(o2.getImpedance(), o1.getImpedance());

    }
}
