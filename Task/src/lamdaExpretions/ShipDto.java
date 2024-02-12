package lamdaExpretions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@AllArgsConstructor
public class ShipDto {
    private String name;
    private String type;
    private int length;
    private int maxSpeed;
}
