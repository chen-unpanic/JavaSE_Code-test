package xx047;

public class system {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis() * 1.0 / 1000 / 60 / 60 / 24 / 365);
//    }
    long star = System.currentTimeMillis();
    for (int i = 1 ;i<10000; i++){
        System.out.println(i);
    }
    long end = System.currentTimeMillis();
    long cha = end - star;
        System.out.println(cha);
}
}
