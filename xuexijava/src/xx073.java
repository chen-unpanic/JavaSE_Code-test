import java.util.Scanner;

public class xx073 {
    public static void main(String[] args) {
        isEvenNumber(10);  //常量值
        int e = 11;
        isEvenNumber(e);      //变量
        Scanner m = new Scanner(System.in);
        int w =m.nextInt();
        isEvenNumber(w);          //输入一个数
    }
public static void isEvenNumber(int nmuber){
        if(nmuber%2==0){
            System.out.println(nmuber+"为偶数");
        } else {
            System.out.println(nmuber+"为奇数");
        }
}
}
