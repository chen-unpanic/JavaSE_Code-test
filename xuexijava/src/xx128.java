import java.util.Scanner;

public class xx128 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        System.out.println("s1:   "+s1);
        System.out.println("s1.length(): "+s1.length());
        StringBuilder s2 = new StringBuilder("おはよう");
        System.out.println("s2: "+s2);
        System.out.println("s2.length()"+s2.length());
        Scanner q =new Scanner(System.in);
        String w = q.nextLine();
        StringBuilder s3 = new StringBuilder(w);
        System.out.println("s3: "+s3);
        System.out.println("s3.length()"+s3.length());
    }
}
