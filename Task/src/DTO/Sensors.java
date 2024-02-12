package DTO;

import lombok.*;

import java.io.Serializable;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor
public class Sensors implements Serializable {
    private String name;
    private String type;
    private double cost;
    private int distance;
}
