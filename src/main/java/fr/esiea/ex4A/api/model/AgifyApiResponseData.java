package fr.esiea.ex4A.api.model;

import java.util.Objects;

public class AgifyApiResponseData {
    public final String name;
    public final int age;
    public final int count;
    public final String country_id;

    public AgifyApiResponseData(String name, int age, int count, String country_id) {
        this.name = name;
        this.age = age;
        this.count = count;
        this.country_id = country_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgifyApiResponseData that = (AgifyApiResponseData) o;
        return age == that.age && count == that.count && Objects.equals(name, that.name) && Objects.equals(country_id, that.country_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, count, country_id);
    }
}
