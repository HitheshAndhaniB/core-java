package lamdaExpretions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class LiftDto {
    private String brand;
    private String model;
    private int capacity; // in persons
    private int maxFloors;
}
