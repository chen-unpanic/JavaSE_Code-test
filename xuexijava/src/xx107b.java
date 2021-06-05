import java.util.Scanner;

public class xx107b {
    public static void main(String[] args) {
        xx107a human= new xx107a();
        /*System.out.println(human.name);
        System.out.println(human.sex);
        System.out.println("----------------");*/

//        human.xianShiMassage();
        human.name="张晓燕";
        human.sex="女";
        Scanner q=new Scanner(System.in);
        int w = q.nextInt();
        human.setAge(w);
        human.xianShiMassage();


    }
}
