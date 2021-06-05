package QiTa;
import java.util.Scanner;
public class NiZhuan2 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
      System.out.println("请输入一个含有10个数的数组");
        int w1 = q.nextInt();
        int w2 = q.nextInt();
        int w3 = q.nextInt();
        int w4 = q.nextInt();
        int w5 = q.nextInt();
        int w6 = q.nextInt();
        int w7 = q.nextInt();
        int w8 = q.nextInt();
        int w9 = q.nextInt();
        int w10 = q.nextInt();
        int[] shuzu={w1,w2,w3,w4,w5,w6,w7,w8,w9,w10};
        System.out.println("你输入的数组为"+"["+w1+","+w2+","+w3+","+w4+","+w5+","+w6+","+w7+","+w8+","+w9+","+w10+"]");
        System.out.println("请输入K（K的范围是[0,10]）");
        int k = q.nextInt();
        int i = 0;
        int j = k-1;
        while (i <= j) {
            int m = shuzu[i];
            int n = shuzu[j];
            shuzu[j] = m;
            shuzu[i] = n;
            i++;
            j--;
        }
        System.out.println("前K个数组逆转后的数组为");
        System.out.print("[");
        for(int x = 0;x<= shuzu.length-1;x++){
            if (x== shuzu.length-1) {
                System.out.print(shuzu[x]);
            } else  {
                System.out.print(shuzu[x]+",");
            }
        } System.out.println("]");

    }
}

