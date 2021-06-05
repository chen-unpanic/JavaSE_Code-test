import java.util.ArrayList;
import java.util.Scanner;

public class xx136_2 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        for(;;){
            String s = q.nextLine();
            if(s.equals("jieshu")){
                break;
            } else {
                al.add(s);
            }
        }
        System.out.println("你输入的集合为"+al);
        System.out.println("你输入的集合长度为"+al.size());
        for(int i=0;i<al.size();i++){
            al.get(i);
            System.out.println(al.get(i));
        }
    }
}
