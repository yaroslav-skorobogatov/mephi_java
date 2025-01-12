package pckg.lesson9.collection;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User /*implements Comparable<User>*/{
    private int id;
    private int age;
    private String name;

//    @Override
//    public int compareTo(User user) {
//        int nameCompare = this.name.compareTo(user.name);
//        if (nameCompare != 0) {
//            return nameCompare;
//        }
//        return Integer.compare(id, user.id);
//    }
}
