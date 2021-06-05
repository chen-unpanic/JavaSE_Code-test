import java.util.Scanner;

public class xx082 {
    public static void main(String[] args) {
        int a = 100;
        System.out.println("调用前"+a);
        change(a);
        System.out.println("调用后"+a);
        System.out.println("--------------");
      /*  Scanner ee = new Scanner(System.in);
        int b=ee.nextInt();
        change(b);
        int ttt=change(b);
        System.out.println();*/
    }
    public static void change(int shuzi){
        shuzi = 200;
    }
}
