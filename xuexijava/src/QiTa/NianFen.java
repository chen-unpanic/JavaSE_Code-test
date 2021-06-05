package QiTa;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Scanner;

public class NianFen {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        for(;;){int nian = year.nextInt();
        getRunPing(nian);
        getShengXiao(nian);
        getTianGan(nian);
        getDiZhi(nian);
        System.out.println(nian+" 公历"+getRunPing(nian)+"  "+"农历"+getTianGan(nian)+getDiZhi(nian)+getShengXiao(nian)+"年");}

    }
public static String getRunPing(int number){
    Calendar c = Calendar.getInstance();
    c.set(number,2,1);

    c.add(Calendar.DATE,-1);
    int b = c.get(Calendar.DATE);
    if(b==29){
        return "闰年";
    } else{

        return "平年";
    }
}
public static String getShengXiao(int number){
        switch (number%12){
            case 0:
                return "猴";
            case 1:
                return "鸡";
            case 2:
                return "狗";
            case 3:
                return "猪";
            case 4:
                return "鼠";
            case 5:
                return "牛";
            case 6:
                return "虎";
            case 7:
                return "兔";
            case 8:
                return "龙";
            case 9:
                return "蛇";
            case 10:
                return "马";
            default:
                return "羊";
        }

}
public static String getTianGan(int number){
        switch ((number-3)%10){
            case 1:
                return "甲";
            case 2:
                return "乙";
            case 3:
                return "丙";
            case 4:
                return "丁";
            case 5:
                return "戊";
            case 6:
                return "己";
            case 7:
                return "庚";
            case 8:
                return "辛";
            case 9:
                return "壬";
            default:
                return "癸";
        }
    }
    public static String getDiZhi(int number){
        switch ((number-3)%12){
            case 1:
                return "子";
            case 2:
                return "丑";
            case 3:
                return "寅";
            case 4:
                return "卯";
            case 5:
                return "辰";
            case 6:
                return "巳";
            case 7:
                return "午";
            case 8:
                return "未";
            case 9:
                return "申";
            case 10:
                return "酉";
            case 11:
                return "戌";
            default:
                return "亥";
        }
    }
}
