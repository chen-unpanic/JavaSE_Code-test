package xx0112;

public class AoTUMan {
    public static void main(String[] args) {
        ZhaoHe ao1 = new ZhaoHe();
        ao1.setName("赛文");
        ao1.setBirthyear(1967);
        System.out.println(ao1.getName()+"   "+ao1.getBirthyear());
        ao1.tezheng();
        ZhaoHe ao2 = new ZhaoHe("雷欧",1974);
        System.out.println(ao1.getName()+"   "+ao1.getBirthyear());
        ao2.tezheng();
    }
}
