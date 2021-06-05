package xx0112;

public class Ultraman {
    private String name;
    private int birthyear;

    public Ultraman() {
    }

    public Ultraman(String name, int birthyear) {
        this.name = name;
        this.birthyear = birthyear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }
}
