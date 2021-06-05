package xx012;

public class Cat extends Anmial{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
