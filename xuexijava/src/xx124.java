import java.util.Scanner;

public class xx124 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int w = q.nextInt();
        int[] shuzu = new int[w];
        for (int i = 0; i < shuzu.length; i++) {
            int e = q.nextInt();
            shuzu[i] = e;
        }
        getStrings(shuzu);
        System.out.println(getStrings(shuzu));
    }

    public static String getStrings(int[] arr) {
        String s = "";
        s += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s += arr[i];
            } else {
                s += arr[i];
                s += ", ";
            }
        }
        s += "]";
        return s;
    }

}


