package fr.esiea.ex4A.matches;

import java.util.Objects;

public class MatchData {

    public final String name;
    public final String twitter;


    public MatchData(String name, String twitter) {
        this.name = name;
        this.twitter = twitter;
    }

    //Constructeur par défaut
    public MatchData() {
        name = null;
        twitter = null;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchData matchData = (MatchData) o;
        return Objects.equals(name, matchData.name) &&
            Objects.equals(twitter, matchData.twitter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, twitter);
    }
}
