package lamdaExpretions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Setter
@Getter
public class TelescopeDto {
    private double aperture;
    private double focalLength;
    private String manufacturer;
    private String model;
}
