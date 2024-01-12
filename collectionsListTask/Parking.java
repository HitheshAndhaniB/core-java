package collectionsListTask;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Parking {
    private String location;
    private int capacity;
    private double hourlyRate;
    private String type;

}
