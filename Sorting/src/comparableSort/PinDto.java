package comparableSort;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PinDto implements Serializable,Comparable<PinDto>{
    private int length;
    private int width;
    private String type;
    private String use;

    @Override
    public int compareTo(PinDto o) {
        return Integer.compare(this.length, o.getLength());
    }
}
