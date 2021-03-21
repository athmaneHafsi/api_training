package fr.esiea.ex4A.inscription;

import fr.esiea.ex4A.api.inscription.UserData;
import fr.esiea.ex4A.api.inscription.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class UserRepositoryTest {

    private final UserRepository userRepository = new UserRepository();
/*
    @Test
    void randomHello_returns_an_hello_based_on_internal_list() {
        UserData helloData = userRepository.randomHello();

        assertThat(helloData.name).isIn(helloRepository.names);
        assertThat(helloData.type).isEqualTo("hello");
        assertThat(helloData.completeSentence).startsWith("hello ").endsWith("!");
    }

    @ParameterizedTest
    @CsvSource({
            "aby, aby",
            "Broly, Broly Broly",
            "cuevin, cuevin cuevin cuevin",
    })
    void hello_for_name_repeats_it_according_to_its_first_letter(String inputName, String expectedOutputName) {
        HelloData helloData = helloRepository.getHelloFor(inputName);

        assertThat(helloData.name).isEqualTo(expectedOutputName);
    }

 */
}
