package QiTa;

import java.util.Random;
import java.util.Scanner;

public class suijishu {
    public static void main(String[] args) {
        Random a = new Random();
       /* int cout = 0;
        for(;;){
        int b = a.nextInt(10);*/
        /*int c = b;*/
/*
            if (c == 8) {
                System.out.println(c);
                System.out.println("分割线");
                break;
            } else {
                System.out.println(c);
                cout += 1;
                System.out.println("-------------");
            }
        }
        System.out.println(cout);*/
        //掷骰子影响
        System.out.println("请选择你要掷骰子的次数");
        Scanner aa = new Scanner(System.in);
        int aaa = aa.nextInt();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;

        for(int i = 1 ; i <= aaa; i++){int b = a.nextInt(5);
            Random r = new Random();
            int r1 = r.nextInt(6);
            int f = 1 +r1;
        switch (f){
            case 1:
                count1 +=1;
                break;
            case 2:
                count2 +=1;
                break;
            case 3:
                count3 +=1;
                break;
            case 4:
                count4 +=1;
                break;
            case 5:
                count5 +=1;
                break;
            default:
                count6 +=1;
                break;
            }
        }
        System.out.println("1点:"+count1);
        System.out.println("2点:"+count2);
        System.out.println("3点:"+count3);
        System.out.println("4点:"+count4);
        System.out.println("5点:"+count5);
        System.out.println("6点:"+count6);
    }
}
