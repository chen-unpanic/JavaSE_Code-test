package xx048;

public class ObjectDemo {
    public static void main(String[] args) {
        Student ak = new Student();
        ak.setName("刘德华");
        ak.setCarier("演员");
        ak.setAge(60);
        System.out.println(ak);  //输出内存地址
    }
}
