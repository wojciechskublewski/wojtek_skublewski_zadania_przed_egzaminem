package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_2;

public class Smurf {

    private String name;
    private String attribute;
    private String description;

    public Smurf(String name, String attribute, String description) {
        this.name = name;
        this.attribute = attribute;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
