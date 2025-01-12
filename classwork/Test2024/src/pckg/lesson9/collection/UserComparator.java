package pckg.lesson9.collection;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        int nameCompare = user1.getName().compareTo(user2.getName());
        if (nameCompare != 0) {
            return nameCompare;
        }
        return Integer.compare(user1.getId(), user2.getId());
    }
}
