package fr.esiea.ex4A.api.service;

import fr.esiea.ex4A.api.client.AgifyClient;
import fr.esiea.ex4A.api.model.AgifyApiResponseData;
import fr.esiea.ex4A.api.model.MatchData;
import fr.esiea.ex4A.api.model.UserData;
import fr.esiea.ex4A.api.repository.MatchesRepository;
import fr.esiea.ex4A.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class MatchService {

    private final AgifyClient agifyClient;
    private final UserRepository userRepository;
    private final MatchesRepository matchesRepository;

    public MatchService(AgifyClient agifyClient, UserRepository userRepository, MatchesRepository matchesRepository) {
        this.agifyClient = agifyClient;
        this.userRepository = userRepository;
        this.matchesRepository = matchesRepository;
    }

    @Cacheable("UserData")
    public UserData getUserAge(UserData user) throws IOException {
        AgifyApiResponseData apiUser = agifyClient.agePredict(user.userName, user.userCountry).execute().body();
        UserData userCurrent = new UserData(user.userName, user.userEmail, user.userTweeter, user.userCountry, user.userSex, user.userSexPref, apiUser.age);
        return userCurrent;
    }


    public ArrayList<MatchData> getMatches(String userName, String country_id) {
        UserData user = userRepository.getUserByUsernameAndCountry(userName, country_id);
        return (ArrayList<MatchData>) matchesRepository.findMatch(user, country_id);
    }
}
