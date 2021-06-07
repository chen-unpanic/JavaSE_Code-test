package bbbbbbb.计算器;

//接口类 里面包含加减乘除四个方法 ，通过一个类去计算，  主方法去计算各自逻辑运算，然后主方法调方法，
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner  x = new Scanner(System.in);
        System.out.println("请输入你要计算的数据");
       int aa = x.nextInt();
        int bb = x.nextInt();
        jiSaun js = new jiSaun(aa,bb);
        for(;;){
            System.out.println("请输入你要计算的方法 1.加法 2.减法 3.乘法 4.除法");
            int xuanze = x.nextInt();
            if(xuanze<0 | xuanze>4){
                System.out.println("你输入选择的方法有误，请重新输入");

            }else if (xuanze==1){
                js.jiafa();
                break;
            }else if (xuanze==2){
                js.jianfa();
                break;
            }else if (xuanze==3){
                js.chengfa();
                break;
            }else if (xuanze==4){
                js.chufa();
                break;
            }

        }




    }}

