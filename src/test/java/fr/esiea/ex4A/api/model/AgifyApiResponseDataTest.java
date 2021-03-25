package fr.esiea.ex4A.api.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgifyApiResponseDataTest {

    @Test
    void testEquals() {
        AgifyApiResponseData userOne = new AgifyApiResponseData("toto", 10, 100, "FR");
        AgifyApiResponseData userTwo = new AgifyApiResponseData("toto", 10, 100, "FR");

        Assertions.assertTrue(userOne.equals(userTwo) && userTwo.equals(userOne));
        Assertions.assertTrue(userOne.hashCode() == userTwo.hashCode());
    }
}
