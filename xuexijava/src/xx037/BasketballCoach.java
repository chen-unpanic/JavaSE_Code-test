package xx037;

public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void pee() {
        System.out.println("教练嘘嘘");
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教学篮球");
    }
}
