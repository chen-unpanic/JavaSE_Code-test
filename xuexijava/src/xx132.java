import java.util.Scanner;

public class xx132 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        String w = q.nextLine();
        String s1 = new String(w);
        stringNiZhuan(s1);
        System.out.println(stringNiZhuan(s1));
    }
    public static String stringNiZhuan(String r){   //定义一个方法，逆转S字符串，参数为S类型
        StringBuilder sb =new StringBuilder(r);  //S转换为SB类型
  sb.reverse();               //      利用SB的逆转
        String r1= sb.toString();   //再逆转回来
        return r1;        //返回结果
    }
}
