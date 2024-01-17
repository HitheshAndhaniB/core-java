package comparableSort;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@Setter
@Getter
@ToString
@AllArgsConstructor
public class WingsDto implements Serializable,Comparable<WingsDto> {
    private String type;
    private double span;
    private boolean feathered;
    private String color;

    public int compareTo(WingsDto o) {
        // TODO Auto-generated method stub
        return this.type.compareTo(String.valueOf(o.getType()));
    }


}
