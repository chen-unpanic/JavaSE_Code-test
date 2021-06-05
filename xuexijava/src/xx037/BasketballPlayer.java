package xx037;

public class BasketballPlayer extends Player{
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void pee() {
        System.out.println("篮球运动员要撒尿");
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习战术");
    }
}
