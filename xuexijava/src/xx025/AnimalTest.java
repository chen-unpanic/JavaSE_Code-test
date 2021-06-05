package xx025;

public class AnimalTest {
    public static void main(String[] args) {
        Animal dw1 = new DogBeer();
        dw1.setName("熊大");
        dw1.setAge(2);
        dw1.eat();
        System.out.println(dw1.getName()+"     "+dw1.getAge());
        System.out.println("---------------------");
        dw1 = new DogBeer("熊二",2);
        dw1.eat();
        System.out.println(dw1.getName()+"     "+dw1.getAge());
        System.out.println("---------------------");

        Animal dw2 = new IronTurtle();
        dw2.eat();
        IronTurtle dw22 = (IronTurtle) dw2;
        dw22.tedian();

    }
}
