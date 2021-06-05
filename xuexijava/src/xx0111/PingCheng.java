package xx0111;

public class PingCheng {
    private String name;
    private int birthyear;

    public PingCheng() {
    }

    public PingCheng(String name, int birthyear) {
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
    public void tezheng(){
        System.out.println("急剧转型");
    }
}
