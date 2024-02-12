package lamdaExpretions.forEachMethod;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class WatchDto implements Serializable,Comparable<WatchDto> {
    private String brand;
    private double price;
    private String type;
    private String material;


    @Override
    public int compareTo(WatchDto o) {
        return 0;
    }
}
