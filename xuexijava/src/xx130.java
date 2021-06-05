import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class xx130 {
    public static void main(String[] args) {
      /*  Scanner q = new Scanner(System.in);
        String w = q.nextLine();
        System.out.println("String to StringBuilder");
        String s1 = new String(w);
        StringBuilder s2 =new StringBuilder(s1);
        System.out.println(s2);

        System.out.println("StringBuilder to String");
        String e = q.nextLine();
        StringBuilder s3 = new StringBuilder(e);
        String s4 =s3.toString();
        System.out.println(s4);
        */
       /* String s1 = new String("a b c");
        StringBuilder s2 = new StringBuilder(s1);
        System.out.println(s1);

        StringBuilder s3 = new StringBuilder("A B c");
        String s4 = s3.toString();
        System.out.println(s4);*/
        Collection<String> a = new ArrayList<String>();
        a.add("a");
        a.add("b");
        System.out.println(a);




    }
}
