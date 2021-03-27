package fr.esiea.ex4A.api.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserDataTest {

    @Test
    void test_if_two_users_Equals() {
        UserData userOne = new UserData("Toto", "toto@gmail.com", "totoTweet", "FR",
            "M", "F", 19);
        UserData userTwo = new UserData("Toto", "toto@gmail.com", "totoTweet", "FR",
            "M", "F", 19);

        Assertions.assertTrue(userOne.equals(userTwo) && userTwo.equals(userOne));
        Assertions.assertTrue(userOne.hashCode() == userTwo.hashCode());
    }

}
