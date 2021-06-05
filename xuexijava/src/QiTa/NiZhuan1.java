package QiTa;
import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
public class NiZhuan1 {
    public static void main(String[] args) {
        //int[] shuzu={1546,41556,6546,8678,9879,34214,6436,131,75};
        Scanner q = new Scanner(System.in);
        System.out.println("请输入一个含有8个数的数组");
        int o1 = q.nextInt();
        int o2 = q.nextInt();
        int o3 = q.nextInt();
        int o4 = q.nextInt();
        int o5 = q.nextInt();
        int o6 = q.nextInt();
        int o7 = q.nextInt();
        int o8 = q.nextInt();
        System.out.println("你数组的数组为"+"["+o1+","+o2+","+o3+","+o4+","+o5+","+o6+","+o7+","+o8+"]");
        int[] shuzu={o1,o2,o3,o4,o5,o6,o7,o8};
        int i = 0;
        int j= shuzu.length-1;
        while (i <= j) {
            int m = shuzu[i];
            int n = shuzu[j];
            shuzu[j] = m;
            shuzu[i] = n;
            i++;
            j--;
        }
        System.out.println("逆转后的数组为");
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



