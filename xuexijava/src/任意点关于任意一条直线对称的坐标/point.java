package 任意点关于任意一条直线对称的坐标;

import java.util.Scanner;

public class point {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.println("请输入点的横纵坐标");
        int a = q.nextInt();
        int b = q.nextInt();
        System.out.println("你输的点坐标为"+"("+a+","+b+")");
        System.out.println("请输入直线的斜率");
        int k = q.nextInt();
        System.out.println("请输入直线的截距");
        int m = q.nextInt();
        System.out.println("直线的方程为"+"y="+k+"x"+"+"+m);
        int a1 = (2*b-2*m+a/k-k*a)/(k+1/k);
        int b2 =(a-a1)/k+b;
        System.out.println("点"+"("+a+","+b+")"+"关于直线"+"y="+k+"x"+"+"+m+"的对称坐标为"+"("+"("+a1+","+b2+")");
    }
}
