package fr.esiea.ex4A.api.inscription;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRepositoryTest {

    private final UserRepository userRepository = new UserRepository();

    @Test
    void adding_user_on_users_list() {
        UserData user = new UserData("Test", "test@test.com",
        "tweeterTest", "FR", "M", "M");
        userRepository.addUser(user);

        Assertions.assertTrue(userRepository.userExist(user));
        Assertions.assertEquals(1, userRepository.users.size());
    }

    @Test
    void adding_user_with_default() {
        UserData user = new UserData();
        userRepository.addUser(user);

        Assertions.assertTrue(userRepository.userExist(user));
        Assertions.assertEquals(1, userRepository.users.size());
    }

}
