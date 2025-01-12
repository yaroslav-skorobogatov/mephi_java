package pckg.sandbox;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String country;
}
