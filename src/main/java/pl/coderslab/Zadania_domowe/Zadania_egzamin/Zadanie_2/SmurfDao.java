package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_2;

import java.util.ArrayList;
import java.util.List;

public class SmurfDao {

    public static List<Smurf> getList() {
        List<Smurf> smurfList = new ArrayList<>();
        smurfList.add(new Smurf("papa","tata","niebieski"));
        smurfList.add(new Smurf("madrala","glupi","zielony"));
        smurfList.add(new Smurf("osilek","sila","silny niebieski koles"));
        smurfList.add(new Smurf("smerfetka","dziewczyna","kwiatek"));
        smurfList.add(new Smurf("lasuch","patelnia","kucharz"));

        return smurfList;
    }

}
