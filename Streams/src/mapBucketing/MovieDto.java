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
public class MovieDto {
    private String movieName;
    private String directerName;
    private Integer year;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieDto movieDto = (MovieDto) o;
        return Objects.equals(getDirecterName(), movieDto.getDirecterName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDirecterName());
    }
}
