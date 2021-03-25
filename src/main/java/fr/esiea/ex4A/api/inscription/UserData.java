package fr.esiea.ex4A.api.inscription;
import org.apache.catalina.User;

import java.util.Objects;

public class UserData {

    public final String userName;
    public final String userEmail;
    public final String userTweeter;
    public final String userCountry;
    public final String userSex;
    public final String userSexPref;

    public UserData(String userName, String userEmail, String userTweeter, String userCountry,
                    String userSex, String userSexPref) {
        this.userName = userName;
        this.userTweeter = userTweeter;
        this.userCountry = userCountry;
        this.userSex = userSex;
        this.userSexPref = userSexPref;
        this.userEmail = userEmail;
    }

    //Constructeur par défaut
    public UserData() {
        userName = null;
        userEmail = null;
        userTweeter = null;
        userCountry = null;
        userSex = null;
        userSexPref = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserData userData = (UserData) o;
        return Objects.equals(userName, userData.userName) &&
            Objects.equals(userEmail, userData.userEmail) &&
            Objects.equals(userTweeter, userData.userTweeter) &&
            Objects.equals(userCountry, userData.userCountry) &&
            Objects.equals(userSexPref, userData.userSexPref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userEmail, userTweeter, userCountry, userSexPref);
    }
}
