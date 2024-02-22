package mapBucketing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@AllArgsConstructor
@ToString
@Getter
@Setter

public class PersonDto {
    private String name;
    private String email;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonDto personDto = (PersonDto) o;
        return Objects.equals(getEmail(), personDto.getEmail());
    }




@Override
public int hashCode() {
    return Objects.hash(getEmail());
}



}
