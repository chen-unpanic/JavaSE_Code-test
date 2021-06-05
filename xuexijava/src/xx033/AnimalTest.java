package xx033;

public class AnimalTest {
    public static void main(String[] args) {
        Jumpping mao1 = new Cat();
        mao1.jump();

        System.out.println("------");
        Animal mao2 = new Cat();
        mao2.setName("大懒猫");
        mao2.setAge(3);
        mao2.eat();
       ((Cat) mao2).jump();    //强制转换到Cat,cat中有jump方法
       /*mao2.jump();   //mao2是Animal类的，而Animal没有jump方法, 所以需要强制装换，如上代码*/
        System.out.println("------------");
        Cat mao3 = new Cat("二懒猫",1);
        mao3.jump();
        mao3.eat();


        System.out.println("--------------");

        Animal gou1 = new Dog("大胡子",2);
        gou1.eat();
        ((Dog) gou1).jump();


    }
}
