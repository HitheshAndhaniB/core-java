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
public class AlarmDto implements Serializable,Comparable<AlarmDto>{
    private String brand;
    private int volume;
    private String type;
    private int hour;
    @Override
    public int compareTo(AlarmDto o) {
        // TODO Auto-generated method stub
        return this.type.compareTo(o.getType());
    }


}

