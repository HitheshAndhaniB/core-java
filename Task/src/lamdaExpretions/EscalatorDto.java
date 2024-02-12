package lamdaExpretions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@AllArgsConstructor

public class EscalatorDto {
    private String brand;
    private String model;
    private int capacity;
    private double cost;

}
