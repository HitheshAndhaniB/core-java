package comparableSort;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@ToString
@Setter
@Getter
@AllArgsConstructor
public class ToyDto implements Serializable,Comparable<ToyDto> {
    private String name;
    private String type;
    private double price;
    private String manufacturer;

    @Override
    public int compareTo(ToyDto o) {
        // TODO Auto-generated method stub
        return this.name.compareTo(String.valueOf(o.getName()));
    }


}
