package fr.esiea.ex4A.api.inscription;

import fr.esiea.ex4A.UserCivility;

import java.util.Objects;

public class UserData {

    public final String userName;
    public final String completeSentence;
    public final String userEmail;
    public final String userTweeter;
    public final String userCountry;
    public final String userSexPref;

    public UserData(String userName, String completeSentence, String userEmail, String userTweeter, String userCountry,
                    String userSexPref) {
        this.userName = userName;
        this.completeSentence = completeSentence;
        this.userTweeter = userTweeter;
        this.userCountry = userCountry;
        this.userSexPref = userSexPref;
        this.userEmail = userEmail;
    }

    public UserData(){
        this.userName = "default";
        this.completeSentence = "default";
        this.userTweeter = "default";
        this.userCountry = UserCivility.M.name();
        this.userSexPref = UserCivility.M.name();
        this.userEmail = UserCivility.M.name();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserData userData = (UserData) o;
        return Objects.equals(userName, userData.userName) &&
            Objects.equals(completeSentence, userData.completeSentence) &&
            Objects.equals(userEmail, userData.userEmail) &&
            Objects.equals(userTweeter, userData.userTweeter) &&
            Objects.equals(userCountry, userData.userCountry) &&
            Objects.equals(userSexPref, userData.userSexPref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, completeSentence, userEmail, userTweeter, userCountry, userSexPref);
    }
}
