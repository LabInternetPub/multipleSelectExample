package cat.tecnocampus.multipleselection;

public class Reviwer {
    private String name;
    private String secondName;

    public Reviwer() {

    }

    public Reviwer(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
