package lamdaExpretions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@Setter
public class ThermometerDto {
    private double temperature;
    private String scale;
    private String manufacturer;
    private String model;
}
