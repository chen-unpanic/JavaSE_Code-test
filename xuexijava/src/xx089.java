import java.util.Scanner;

public class xx089 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int w = q.nextInt();
        jianFei(w);
        System.out.println(jianFei(w));
    }
    public static String jianFei(int r){
        if(r==1) {
            return "跑步";
        } else  if(r==2) {
            return "游泳";
        } else if(r==3) {
            return "慢走";
        } else if(r==4) {
            return "动感单车";
        } else if(r==5) {
            return "拳击";
        } else if(r==6) {
            return "爬山";
        } else {
            return "好好吃一顿";
        }
    }
}
