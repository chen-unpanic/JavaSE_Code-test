import java.util.Calendar;
import java.util.Scanner;

public class xx062 {
    public static void main(String[] args) {
       /* Calendar c = Calendar.getInstance(); //多太形式创建对象 ,以现在计算机的时间
        System.out.println(c);*/

     /*  c.add(Calendar.YEAR,-20);
        c.add(Calendar.MONTH,+5);
        c.add(Calendar.DATE,+10);
        int i1 = c.get(Calendar.YEAR);
        int i2 = c.get(Calendar.MONTH) + 1;   //月份从0开始
        int i3 = c.get(Calendar.DATE);
        System.out.println(i1 + "年" + i2 + "月" + i3 + "日");*/

/*        c.set(2005,4,26);
 //先设置，再获取，才能输出
        int i1 = c.get(Calendar.YEAR);
        int i2 = c.get(Calendar.MONTH) + 1;   //月份从0开始
        int i3 = c.get(Calendar.DATE);
        System.out.println(i1 + "年" + i2 + "月" + i3 + "日");*/
 //064_二月天 案例
        Scanner a = new Scanner(System.in);

/*for(;;){int b =a.nextInt();
Calendar c= Calendar.getInstance();
c.set(b,2,1);
c.add(Calendar.DATE,-1);
int i = c.get(Calendar.DATE);
        System.out.println(i);}*/
        int b = a.nextInt();
        int d = a.nextInt();
        for(int i = b;i<d;i++){
            Calendar c = Calendar.getInstance();
            c.set(i,2,1);   //先设置set,在修改st,再获取
            c.add(Calendar.DATE,-1);
            int ii = c.get(Calendar.DATE);
            System.out.println(i+"年二月有"+ii+"天");
        }
    }
}
