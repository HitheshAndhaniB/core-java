package comparableSort;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FireCrackerDto implements Serializable,Comparable<FireCrackerDto>{
    private String name;
    private double cost;
    private int quantity;
    private String company;
    @Override
    public int compareTo(FireCrackerDto o) {
        // TODO Auto-generated method stub
        return this.name.compareTo(o.getName());
    }


}
