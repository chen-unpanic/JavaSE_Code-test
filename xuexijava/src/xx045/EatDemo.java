package xx045;

public class EatDemo {
    public static void main(String[] args) {
        EatOperator duixiang = new EatOperator();
        Eat dsa = new Dog();
        duixiang.method(dsa);

        duixiang.method(new Eat() {
            @Override
            public void eating() {
                System.out.println("吃屎");
            }
        });
    }
}
