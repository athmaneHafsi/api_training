package fr.esiea.ex4A.api.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchDataTest {

    @Test
    void test_equals_with_two_matchs() {
        MatchData userOne = new MatchData("Toto", "totoTweet");
        MatchData userTwo = new MatchData("Toto", "totoTweet");

        Assertions.assertTrue(userOne.equals(userTwo) && userTwo.equals(userOne));
        Assertions.assertTrue(userOne.hashCode() == userTwo.hashCode());
    }
}
