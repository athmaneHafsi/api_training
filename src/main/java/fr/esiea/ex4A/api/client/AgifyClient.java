package fr.esiea.ex4A.api.client;

import fr.esiea.ex4A.api.model.AgifyApiResponseData;
import fr.esiea.ex4A.api.model.MatchData;
import retrofit2.Call;
import retrofit2.http.*;
import java.util.List;
import java.util.Map;

public interface AgifyClient {

    @GET("/")
    Call<AgifyApiResponseData> agePredict(@Query("name") String userName, @Query("country_id") String userCountry);
}
