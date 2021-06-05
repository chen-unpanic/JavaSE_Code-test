package xx012;

public class AnmialDemo {
    public static void main(String[] args) {
        Cat mao1 = new Cat();
        mao1.setName("汤姆");
        mao1.setAge(2);
        System.out.println(mao1.getName()+"----"+mao1.getAge());
        mao1.catchMouse();
        System.out.println();
        Cat mao2 = new Cat("哆啦A梦",5);
        System.out.println(mao2.getName()+"----"+mao2.getAge());
        mao2.catchMouse();
        System.out.println();
        Dog gou1 = new Dog();
        gou1.setName("大狗");
        gou1.setAge(2);
        System.out.println(gou1.getName()+"----"+gou1.getAge());
        gou1.lookDoor();
        System.out.println();
        Dog gou2 = new Dog("二狗",3);
        System.out.println(gou2.getName()+"----"+gou2.getAge());
        gou2.lookDoor();
    }
}
