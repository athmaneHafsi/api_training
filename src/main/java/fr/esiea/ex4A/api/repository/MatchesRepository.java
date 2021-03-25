package fr.esiea.ex4A.api.repository;

import fr.esiea.ex4A.api.model.MatchData;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MatchesRepository {

    public final List<MatchData> matchesUsers = new ArrayList<>();

    public List<MatchData> findMatch(String username, String usercountry) {
        List<MatchData> matches = new ArrayList<>();
        matches.add(new MatchData("machin", "machin45"));
        matches.add(new MatchData("truc", "trucbidule"));
        return matches;
    }

}
