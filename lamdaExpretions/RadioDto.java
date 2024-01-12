package lamdaExpretions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@AllArgsConstructor

public class RadioDto {
    private String brand;
    private double frequency;
    private int volumeLevel;
    private String color;

}
