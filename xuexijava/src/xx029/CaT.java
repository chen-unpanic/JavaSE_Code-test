package xx029;

public class CaT extends Animal {
    public CaT() {
    }

    public CaT(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
