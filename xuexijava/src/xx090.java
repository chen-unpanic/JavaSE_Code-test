import java.util.Scanner;

public class xx090 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int e = q.nextInt();
        jianFei2(e);
        System.out.println(jianFei2(e));
    }

    public static String jianFei2(int a) {
        switch (a) {
            case 1:
                return "跑步";

            case 2:
                return "游泳";

            case 3:
                return "慢跑";

            case 4:
                return "爬山";

            case 5:
                return "拳击";

            case 6:
                return "斗地主";

            case 7:
                return "好好吃一顿";

            default:
                return "false";

        }

    }
}

