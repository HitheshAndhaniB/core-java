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

public class CompanyDto {
       private String name;
       private String location;
       private int pincode;

       @Override
       public boolean equals(Object o) {
              if (this == o) return true;
              if (o == null || getClass() != o.getClass()) return false;
              CompanyDto that = (CompanyDto) o;
              return Objects.equals(getName(), that.getName());
       }

       @Override
       public int hashCode() {
              return Objects.hash(getName());
       }
}
