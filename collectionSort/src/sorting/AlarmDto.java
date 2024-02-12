package sorting;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
@AllArgsConstructor
public class AlarmDto implements Serializable{
    private String tune;
    private int timings;
    private double duration;
    private String type;



}
