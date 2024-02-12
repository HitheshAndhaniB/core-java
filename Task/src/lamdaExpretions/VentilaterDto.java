package lamdaExpretions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Setter
@Getter
public class VentilaterDto {
    private String brand;
    private String model;
    private int airflow;
    private String controlType;

}
