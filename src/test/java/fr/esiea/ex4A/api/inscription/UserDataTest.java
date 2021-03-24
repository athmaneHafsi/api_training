package fr.esiea.ex4A.api.inscription;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDataTest {

    @Test
    void test_if_two_users_Equals() {
        UserData userOne = new UserData("Toto", "toto@gmail.com", "totoTweet", "FR",
            "M", "F");
        UserData userTwo = new UserData("Toto", "toto@gmail.com", "totoTweet", "FR",
            "M", "F");

        Assertions.assertTrue(userOne.equals(userTwo) && userTwo.equals(userOne));
        Assertions.assertTrue(userOne.hashCode() == userTwo.hashCode());
    }

}
