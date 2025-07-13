package pckg;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

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