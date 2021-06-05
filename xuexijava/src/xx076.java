import java.util.Scanner;

public class xx076 {
     /*     //任意输入两个数，用方法调用输出其中大的一个
     public static void main(String[] args) {
      Scanner q = new Scanner(System.in);
        int a = q.nextInt();
        int b = q.nextInt();
        getMax(a,b);      //直接接收返回结果
        System.out.println(getMax(a,b));
        System.out.println("--------------------------------");
        int e = q.nextInt();
        int f = q.nextInt();
        getMax(e,f);
        int result = getMax(e,f);  //定义变量接收结果
        System.out.println(result);
    }
    public static int getMax(int c,int d){
        if(c>d){
            return c;
        } else {
        return d;
    }
    }*/


    //任意输入三个数，用方法调用输入最小的数
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int w = q.nextInt();
        int e = q.nextInt();
        int r = q.nextInt();
        getMin(w,e,r);
        System.out.println(getMin(w,e,r));
    }
    public static int getMin(int a,int b,int c){
        if(a>b & b>c){
            return c;
        }else  if (a>b & b<c){
            return b;
        } else {
            return a; }
    }

}
