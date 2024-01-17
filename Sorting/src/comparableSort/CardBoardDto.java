package comparableSort;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@AllArgsConstructor
@Getter
@Setter

public class CardBoardDto implements Serializable,Comparable<CardBoardDto> {

    private String brand;
    private double length;
    private double width;
    private String color;
    @Override
    public int compareTo(CardBoardDto o) {
        // TODO Auto-generated method stub
        return this.brand.compareTo(String.valueOf(o.getBrand()));
    }

}