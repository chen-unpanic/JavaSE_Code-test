import java.util.Scanner;

public class xx129 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("我");
        s1.append("爱");
        s1.append("编");
        s1.append("程");
        System.out.println("s1   "+s1);
        StringBuilder s2 = new StringBuilder("我");
        s2.append("爱").append("编").append("程");   //链式编程,因为append返回对象本身
        System.out.println("s2   "+s2);
        Scanner q = new Scanner(System.in);
        String w = q.nextLine();
        StringBuilder s3 = new StringBuilder(w);
        s3.reverse();
        System.out.println("s3    "+s3);

    }
}
