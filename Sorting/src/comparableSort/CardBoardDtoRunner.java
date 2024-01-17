package comparableSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardBoardDtoRunner {
    public static void main(String[] args) {
        CardBoardDto CardBoardDto1 = new CardBoardDto("Brand1", 10.5, 7.2,  "Brown");
        CardBoardDto CardBoardDto2 = new CardBoardDto("Brand2", 12.0, 8.5,  "White");
        CardBoardDto CardBoardDto3 = new CardBoardDto("Brand3", 15.0, 9.0,  "Green");
        CardBoardDto CardBoardDto4 = new CardBoardDto("Brand4", 8.5, 6.0,  "Blue");
        CardBoardDto CardBoardDto5 = new CardBoardDto("Brand5", 11.2, 7.8,  "Yellow");

        List<CardBoardDto> list = new ArrayList<>();
        list.add(CardBoardDto1);
        list.add(CardBoardDto2);
        list.add(CardBoardDto3);
        list.add(CardBoardDto4);
        list.add(CardBoardDto5);

        Collections.sort(list);
        System.out.println("after sorting in ascending order");
        for(CardBoardDto ref:list) {
            System.out.println(ref);
        }


    }
}
