package pl.coderslab.Zadania_domowe.Zadania_egzamin;

import org.apache.commons.lang3.StringUtils;
import pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_domowe_dzien_4_5.AirportDao;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static java.time.ZoneId.of;

public class Main {
    private static final String DATE_FORMAT = "dd-M-yyyy hh:mm:ss a";
    public static void main(String[] args) {

     ZonedDateTime zonedDateTime = ZonedDateTime.now();
     ZonedDateTime time = ZonedDateTime.now(of("America/Chicago"));
     int hours = time.getHour();

        DateTimeFormatter format = DateTimeFormatter.ofPattern(DATE_FORMAT);
        ZoneId zoneId = ZoneId.of("Europe/Warsaw");

        ZonedDateTime zdt = LocalDateTime.now().atZone(zoneId);
        zdt = zdt.plusHours(2);

        String timeup = zdt.toString();
        long ldtup = Date.parse(timeup);
        System.out.println(ldtup);
    }
}
