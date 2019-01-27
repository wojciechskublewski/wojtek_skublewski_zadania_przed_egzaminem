package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_domowe_dzien_4_5;

public class Airport {

    private String name;
    private String airport;
    private String timezone;

    public Airport(String name, String airport, String timezone) {
        this.name = name;
        this.airport = airport;
        this.timezone = timezone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + name + '\'' +
                ", airport='" + airport + '\'' +
                ", timezone='" + timezone + '\'' +
                '}';
    }
}
