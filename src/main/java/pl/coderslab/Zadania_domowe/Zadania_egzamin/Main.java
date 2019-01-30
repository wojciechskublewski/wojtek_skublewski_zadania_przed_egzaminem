package pl.coderslab.Zadania_domowe.Zadania_egzamin;

import org.apache.commons.lang3.StringUtils;
import pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_2.Smurf;
import pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_2.SmurfDao;
import pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_domowe_dzien_4_5.AirportDao;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import static java.time.ZoneId.of;

public class Main {

    public static void main(String[] args) {
        SmurfDao smurfDao = new SmurfDao();
        List<Smurf> smurfList = SmurfDao.getList();

        System.out.println(smurfList.toString());

    }
}
