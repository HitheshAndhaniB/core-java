package collectionsListTask;

import java.util.Comparator;

public class SpeakerSensitivityDesc implements Comparator<Speaker> {

    @Override
    public int compare(Speaker o1, Speaker o2) {
        return Integer.compare(o2.getSensitivity(), o1.getSensitivity());

    }

}
