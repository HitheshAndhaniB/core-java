package mapBucketing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString

public class ItemDto {
    private String itemName;
    private Double weight;
    private Double cost;

}
