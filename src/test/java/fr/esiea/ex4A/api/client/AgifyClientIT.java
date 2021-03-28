package fr.esiea.ex4A.api.client;

import fr.esiea.ex4A.api.model.AgifyApiResponseData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class AgifyClientIT {

    private final AgifyClient agifyClient;

    AgifyClientIT(@Autowired AgifyClient agifyClient) {
        this.agifyClient = agifyClient;
    }

    @Test
    void age_Predict() throws IOException {

        Call<AgifyApiResponseData> apiCall = agifyClient.agePredict("mickael", "FR");
        Response<AgifyApiResponseData> response = apiCall.execute();

        assertThat(response.isSuccessful())
            .isEqualTo(true);
        assertThat(response.body().name).isEqualTo("mickael");
        assertThat(response.body().country_id).isEqualTo("FR");
    }
}
