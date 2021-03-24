package fr.esiea.ex4A.api.inscription;

import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class UserRepository {

    public final List<UserData> users = new ArrayList<>();

    public UserData addUser(UserData user) {
        users.add(user);
        return user;
    }

    public boolean userExist(UserData user) {
        return containsUser(users, user);
    }

    private boolean containsUser(List<UserData> users, UserData userToCheck) {
        boolean result = false;
        for (UserData object : users) {
            if (object.equals(userToCheck))
                result = true;
        }
        return result;
    }
}
