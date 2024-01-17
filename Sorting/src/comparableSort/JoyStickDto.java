package comparableSort;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor@NoArgsConstructor@ToString
public class JoyStickDto implements Comparable<JoyStickDto>,Serializable{
    private String name;
    private double cost;
    private int quantity;
    private String company;
    @Override
    public int compareTo(JoyStickDto o) {
        // TODO Auto-generated method stub
        return this.name.compareTo(o.getName());
    }
}
