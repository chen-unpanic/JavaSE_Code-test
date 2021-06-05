package bbbbbbb;

import java.util.Scanner;

public class jzt {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("请输入金字塔层数" );
        int a = s.nextInt();
        for(int i = 1;i<a;i++){   //控制层数
            for(int j = 0 ; j<a -i ;j++){
                System.out.print(" ");
            }
            for(int k = 0; k<2*i-1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }

        }
    }
