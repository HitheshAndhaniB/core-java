package mapBucketing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@ToString
@AllArgsConstructor
@Getter
@Setter

public class CollegeDto {
    private String collegeName;
    private String city;
    private int yearOfStart;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollegeDto that = (CollegeDto) o;
        return Objects.equals(getCollegeName(), that.getCollegeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCollegeName());
    }
}
