import java.util.Scanner;

public class xx081 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int w = q.nextInt();
        int e = q.nextInt();
      /*  compare(w, e);
        System.out.println(compare(w,e));
        System.out.println("分割线-----------");
        byte r = q.nextByte();
        byte t = q.nextByte();
        compare(r,t);
        System.out.println(compare(r,t));
        System.out.println("分割线-----------");
        long y= q.nextLong();
        long u= q.nextLong();
        compare(y,u);
        System.out.println(compare(y,u));
        System.out.println("分割线-----------");
        short i = q.nextShort();
        short o = q.nextShort();
        compare(i,o);
        System.out.println(compare(i,o));*/
        //输出调用
        System.out.println(compare(w,e));
        System.out.println(compare((byte) w,(byte)e));  //输出调用并且强制类型转换
        System.out.println(compare(5,10));
        System.out.println(compare(5l,10l));
        System.out.println(compare((short) w,(short) e));
    }

    public static boolean compare(int n, int m) {
        return n == m;
    }

    public static boolean compare(byte n, byte m) {
        return n == m;
    }

    public static boolean compare(long n, long m) {
        return n == m;
    }

    public static boolean compare(short n, short m) {
        return n == m;
    }
}

