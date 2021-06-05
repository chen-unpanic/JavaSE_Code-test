package 会员管理系统;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class VipMagentSystem {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);

        System.out.println("请输入管理员的账号");
        String zhanghao = q.nextLine();
        System.out.println("请输入管理员密码");
        String mima = q.nextLine();

        ArrayList<Vip> al = new ArrayList<>();
        while (true) {
            System.out.println("----------欢迎使用诚不慌会员管理系统----------");
            System.out.println("1.添加会员信息");
            System.out.println("2.修改会员信息");
            System.out.println("3.删除会员信息");
            System.out.println("4.查看会员信息");
            System.out.println("5.退出本系统");
            System.out.println("");
            System.out.println("请按数字选择你要进行的操作");
            int w = q.nextInt();
            if (w < 0 | w > 5) {
                System.out.println("你输入的数字有误请重新输入");
            } else {
                switch (w) {
                    case 1:
                        add(al);
                        break;
                    case 2:
                        change(al);
                        break;
                    case 3:
                        cancer(al);
                        break;
                    case 4:
                        browse(al);
                        break;
                    default:
                        System.out.println("谢谢使用本系统");
                        System.exit(0);
                }
            }
        }
    }

    public static void add(ArrayList AL) {
        Scanner q = new Scanner(System.in);
        Scanner p = new Scanner(System.in);
        System.out.println("请输入会员姓名");
        String a = q.nextLine();
        System.out.println("请输入会员电话");
        String b = q.nextLine();
        Random h = new Random();
        int cc = h.nextInt(100);
        int c = cc+2021000;
        System.out.println("请输入会员地址");
        String d = p.nextLine();
        Vip v = new Vip();  //创建会员对象
        v.setName(a);
        v.setCallnumber(b);
        v.setVipnumber(c);
        v.setAddress(d);
        AL.add(v);
        System.out.println("添加会员信息成功");


    }   //添加

    public static void change(ArrayList AL) {
        System.out.println("请输入你要修的会员账号");
        Scanner q = new Scanner(System.in);
        String a = q.nextLine();
        for (int i = 0; i < AL.size(); i++) {
            Vip v = (Vip) AL.get(i);
            System.out.println("输入数字进行操作");
            System.out.println("1.修改名字 2.修改电话 3.修改地址 ");
            int t = q.nextInt();
            switch (t) {
                case 1:
                    System.out.println("请输入新名字");
                    String aa = q.nextLine();
                    v.setName(aa);
                    break;
                case 2:
                    System.out.println("请输入新电话");
                    String bb = q.nextLine();
                    v.setCallnumber(bb);
                    break;
                case 3:
                    System.out.println("请输入新住址");
                    String dd = q.nextLine();
                    v.setAddress(dd);
                    break;
                default:
                    System.out.println("你输入的数字错误");
            }
        }
    }    //修改

    public static void cancer(ArrayList AL) {
        System.out.println("请输入你要删除会员账号");
        Scanner q = new Scanner(System.in);
        int a = q.nextInt();
        for (int i = 0; i < AL.size(); i++) {
            Vip v = (Vip) AL.get(i);
            if (i==a) {
                AL.remove(i);
                System.out.println("删除成功");
                break;
            }

        }
    }  //删除

    public static void browse(ArrayList AL){
        if(AL.size()==0){
            System.out.println("没有任何会员信息，请先添加再查询");
        } else {
        System.out.println("姓名\t\t电话\t\t\t账号\t\t\t地址");
        for(int i = 0;i<AL.size();i++){
            Vip v = (Vip) AL.get(i);
            System.out.println(v.getName()+"\t"+v.getCallnumber()+"\t"+v.getVipnumber()+"\t\t"+v.getAddress());
        }
        }
    }  //查看
}


