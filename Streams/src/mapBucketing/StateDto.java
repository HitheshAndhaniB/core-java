package mapBucketing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@AllArgsConstructor
@Setter
@Getter
@ToString

public class StateDto {
    private String stateName;
    private String capitalOfCity;
    private Double areaInkm;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StateDto stateDto = (StateDto) o;
        return Objects.equals(getAreaInkm(), stateDto.getAreaInkm());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAreaInkm());
    }
}
