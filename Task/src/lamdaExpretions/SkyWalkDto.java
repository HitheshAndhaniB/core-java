package lamdaExpretions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class SkyWalkDto {
    private String location;
    private int height;
    private int capacity;
    private String city;
}
