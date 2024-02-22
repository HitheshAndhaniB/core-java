package mapBucketing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class CityDto {
    private String cityName;
    private String capitalOfCity;
    private Double areainKm;

}
