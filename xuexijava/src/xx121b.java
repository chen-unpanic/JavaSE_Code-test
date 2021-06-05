import java.util.Scanner;

public class xx121b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("注册账户");
        String c = sc.nextLine();
        xx121a zhanghu = new xx121a();
        zhanghu.zhuCeA(c);
        System.out.println("账号为:" + c);

        String d = sc.nextLine();
        xx121a mima = new xx121a();
        mima.zhuCeB(d);
        System.out.println("密码为:" + d);
        System.out.println("恭喜你，注册成功");

        for (int i = 1; i < 6; i++) {
            System.out.println("请输入用户名");
            String a = sc.nextLine();
            System.out.println("密码");
            String b = sc.nextLine();

            if (a.equals(c) && b.equals(d)) {
                System.out.println("登录成功");
                break;
            } else {
                if (5 - i == 0) {
                    System.out.println("连续输错上次，你的账户已经被锁定，请于管理员联系");
                } else {
                    System.out.println("输入错误，你还有" + (5 - i) + "次机会输入");
                }
            }
        }
    }
}
