package xx058;

import java.util.Date;

public class datetest {
    public static void main(String[] args) {
        Date d1 = new Date();  //创建日期对象
        System.out.println(d1);        //输出当前时间 CST表示中国标准时间
        System.out.println((d1.getTime())/1000/60/60/24/365);  //getTime获取1970.1.1到今天的时间


        long a = 1000*60*60;
        Date d2 = new Date(a);
        System.out.println(d2);
        d1.setTime(a);
        System.out.println(d1);
    }
}
