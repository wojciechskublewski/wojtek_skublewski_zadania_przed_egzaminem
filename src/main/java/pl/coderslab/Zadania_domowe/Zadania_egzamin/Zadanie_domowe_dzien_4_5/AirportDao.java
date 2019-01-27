package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_domowe_dzien_4_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirportDao {


    public  static List<Airport> getList(){
        List<Airport> airportList = new ArrayList<>();

        File file = new File("/home/wskublewski/warsztaty/modul_03/wojtek_skublewski_zadania_przed_egzaminem/src/main/java/pl/coderslab/Zadania_domowe/Zadania_egzamin/Zadanie_domowe_dzien_4_5/airports.txt");
        StringBuilder reading = new StringBuilder();
        String fileLine = "";
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                fileLine = scan.nextLine();
                String[] fileLineArr = fileLine.split(";");
                airportList.add(new Airport(fileLineArr[0], fileLineArr[1],fileLineArr[2]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku.");
        }

        System.out.println(airportList.toString());
        return airportList;
    }
}
