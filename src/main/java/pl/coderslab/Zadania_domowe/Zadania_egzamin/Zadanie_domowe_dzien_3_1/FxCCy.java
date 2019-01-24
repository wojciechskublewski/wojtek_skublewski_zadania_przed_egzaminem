package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_domowe_dzien_3_1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FxCCy {

    private String ccy1;
    private String ccy2;
    private double rate;

    public FxCCy(String ccy1, String ccy2, double rate) {
        this.ccy1 = ccy1;
        this.ccy2 = ccy2;
        this.rate = rate;
    }

    public String getCcy1() {
        return ccy1;
    }

    public void setCcy1(String ccy1) {
        this.ccy1 = ccy1;
    }

    public String getCcy2() {
        return ccy2;
    }

    public void setCcy2(String ccy2) {
        this.ccy2 = ccy2;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public static List<FxCCy> addCcyFx(){

        List<FxCCy> fxCCyList = new ArrayList<>();

        FxCCy fxCCy = new FxCCy("EUR", "USD", 1.4567);
        FxCCy fxCCy1 = new FxCCy("USD", "EUR", 0.9876);
        FxCCy fxCCy2 = new FxCCy("EUR", "PLN", 4.3456);
        FxCCy fxCCy3 =new FxCCy("PLN", "EUR", 0.6798);
        FxCCy fxCCy4 = new FxCCy("USD", "PLN", 3.7689);
        FxCCy fxCCy5 = new FxCCy("PLN", "USD", 0.3546);

        fxCCyList.add(fxCCy);
        fxCCyList.add(fxCCy1);
        fxCCyList.add(fxCCy2);
        fxCCyList.add(fxCCy3);
        fxCCyList.add(fxCCy4);
        fxCCyList.add(fxCCy5);
        return fxCCyList;
    }
}


