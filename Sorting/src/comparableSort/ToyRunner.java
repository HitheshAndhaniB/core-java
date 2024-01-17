package comparableSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToyRunner {
    public static void main(String[] args) {
        ToyDto ToyDto1 = new ToyDto("Action Figure", "Action", 19.99,"ToyDtoCo");
        ToyDto ToyDto2 = new ToyDto("Doll", "Doll", 14.99, "PlayCo");
        ToyDto ToyDto3 = new ToyDto("Remote Control Car", "Vehicle", 29.99,  "RC ToyDtos");
        ToyDto ToyDto4 = new ToyDto("Board Game", "Game", 24.99, "Family Games");
        ToyDto ToyDto5 = new ToyDto("Plush ToyDto", "Stuffed Animal", 12.99, "Soft ToyDtos");

        List<ToyDto> list = new ArrayList<>();
        list.add(ToyDto1);
        list.add(ToyDto2);
        list.add(ToyDto3);
        list.add(ToyDto4);
        list.add(ToyDto5);

        Collections.sort(list);
        System.out.println("after sorting Name in ascending order");
        for(ToyDto ref:list) {
            System.out.println(ref);
        }

        Collections.sort(list,(o1,o2)->o2.getName().compareTo(o1.getName()));
        System.out.println("after sorting Name in descending order");
        for(ToyDto ref:list) {
            System.out.println(ref);
        }

    }
}
