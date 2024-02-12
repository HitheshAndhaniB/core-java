package lamdaExpretions.forEachMethod;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PlayGroundDto implements Serializable,Comparable<PlayGroundDto> {

    private String name;
    private String location;
    private Double distence;
    private Double area;


    @Override
    public int compareTo(PlayGroundDto o) {
        return 0;
    }
}
