package CollectionsListTask;

import lombok.*;

@ToString
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Sensors {
    private String name;
    private String type;
    private double sensitivity;
    private double range;

}
