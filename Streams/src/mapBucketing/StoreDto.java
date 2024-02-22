package mapBucketing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@ToString
@Setter
@Getter
@AllArgsConstructor
public class StoreDto {
    private String storeName;
    private String location;
    private int storeID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoreDto storeDto = (StoreDto) o;
        return Objects.equals(getStoreName(), storeDto.getStoreName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStoreName());
    }
}
