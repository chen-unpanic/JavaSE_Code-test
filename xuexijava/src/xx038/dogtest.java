package xx038;

public class dogtest {
    public static void main(String[] args) {
        dogopeartor dd = new dogopeartor();
        dog ddd = new dog();
        dd.usedot(ddd);  //需要dog类对象

        dog ds2 = dd.getfog();
        ds2.eat(); //返回的是dog类对象

    }
}
