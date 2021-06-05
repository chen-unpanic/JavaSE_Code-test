import java.util.Scanner;

public class xx075 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int w = q.nextInt();
        int e = q.nextInt();
        getMax(w,e);
        int r = q.nextInt();
        int t = q.nextInt();
        getMax(r,t);

    }
    public static void getMax(int a,int b){
        int max = a;
        if(max<b){
             max =b ;
            System.out.println("最大值为"+max);
        }else {
            System.out.println("最大值为"+max);
        }
    }
}
