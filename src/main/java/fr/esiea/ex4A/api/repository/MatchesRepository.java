package fr.esiea.ex4A.api.repository;

import fr.esiea.ex4A.api.model.MatchData;
import fr.esiea.ex4A.api.model.UserData;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MatchesRepository {

    public final UserRepository userRepository;

    public MatchesRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<MatchData> findMatch(int age, String country_id, String userSexPref) {
        ArrayList<MatchData> usersMatched = new ArrayList<>();
        if (userRepository.users != null && userRepository.users.size() > 1){
            for(UserData u : userRepository.users) {
                if (u.userSexPref.equals(userSexPref) && (u.userAge - age <= 4)){
                        usersMatched.add(new MatchData(u.userName, u.userTweeter));
                }
            }
        }
        return usersMatched;
    }

}
