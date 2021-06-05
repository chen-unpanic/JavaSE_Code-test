package xx033;

public class Dog extends Animal implements Jumpping{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃屎");
    }

    @Override
    public void jump() {
        System.out.println("狗也跳高高哦高高");
    }
}
