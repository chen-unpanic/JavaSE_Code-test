import java.util.Scanner;

public class xx088 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int w = q.nextInt();
        int e = q.nextInt();
        System.out.println(getMax(w,e));
    }
    public static int getMax(int a,int b){
        if(a>b){
            return a;
        }else {return b;}
    }
}
