package lamdaExpretions.forEachMethod;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor

public class DiseaseDto implements Serializable,Comparable<DiseaseDto> {
    private String name;
    private  String symtoms;
    private String treatment;
    private String consernDocter;

    @Override
    public int compareTo(DiseaseDto o) {
        return 0;
    }
}
