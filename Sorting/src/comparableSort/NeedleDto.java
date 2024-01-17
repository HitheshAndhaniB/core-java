package comparableSort;

import lombok.*;

import java.io.Serializable;
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class NeedleDto implements Serializable,Comparable<NeedleDto>{
    private int length;
    private int width;
    private String type;
    private String use;

    @Override
    public int compareTo(NeedleDto o) {
        return Integer.compare(this.length, o.getLength());
    }



}
