import java.util.Scanner;

public class xx125 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        String w = q.nextLine();
        String oo = swapString(w);
        System.out.println(oo);
    }

    public static String swapString(String r) {
        String t = "";
        for (int y = r.length()-1; y >= 0; y--) {
            t += r.charAt(y);
        }
        return t;

    }
}
