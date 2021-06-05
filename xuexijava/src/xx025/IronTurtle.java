package xx025;

public class IronTurtle extends Animal{
    public IronTurtle() {
    }

    public IronTurtle(String name, int age) {
        super(name, age);
    }
    public void eat(){
        System.out.println("王八吃小鱼");
    }
    public void tedian(){
        System.out.println("王八有壳");
    }
}
