package fr.esiea.ex4A.api.repository;

import fr.esiea.ex4A.api.model.UserData;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class UserRepository {

    public final List<UserData> users = new ArrayList<>();

    public UserData addUser(UserData user) {
        users.add(user);
        return user;
    }

    public UserData getUserByUsernameAndCountry(String userName, String country) {
        for(UserData u : users) {
            if (u.userCountry.equals(country) && u.userName.equals(userName)){
                return u;
            }
        }
        return null;
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
