package xx0111;

public class AoTeMan {
    public static void main(String[] args) {
        ZhaoHe ao1 = new ZhaoHe();
        ao1.setName("赛文");
        ao1.setBirthyear(1967);
        System.out.println(ao1.getName() + "  " + ao1.getBirthyear());
        ao1.tezheng();
        ZhaoHe ao2 = new ZhaoHe("雷欧", 1974);
        System.out.println(ao2.getName() + "  " + ao2.getBirthyear());
        ao2.tezheng();
        System.out.println("--------------");
        PingCheng ao3 = new PingCheng();
        ao3.setName("迪迦");
        ao3.setBirthyear(1996);
        System.out.println(ao3.getName() + "  " + ao3.getBirthyear());
        ao3.tezheng();
        PingCheng ao4 = new PingCheng("盖亚", 1998);
        System.out.println(ao4.getName() + "  " + ao4.getBirthyear());
        ao4.tezheng();
        System.out.println("--------------");
        LingHe ao5 = new LingHe();
        ao5.setName("泰迦");
        ao5.setBirthyear(2019);
        System.out.println(ao5.getName() + "  " + ao5.getBirthyear());
        ao5.tezheng();
        LingHe ao6 = new LingHe("泽塔", 2020);
        System.out.println(ao6.getName() + "  " + ao6.getBirthyear());
        ao6.tezheng();
        System.out.println("--------------");
    }
}
