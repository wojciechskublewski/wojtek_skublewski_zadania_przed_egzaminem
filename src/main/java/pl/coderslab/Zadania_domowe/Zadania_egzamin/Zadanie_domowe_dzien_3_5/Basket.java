package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_domowe_dzien_3_5;

public class Basket {

    private String product;
    private int number;
    private int price;

    public Basket(String product, int number, int price) {
        this.product = product;
        this.number = number;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
