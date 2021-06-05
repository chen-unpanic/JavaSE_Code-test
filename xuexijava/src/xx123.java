import java.util.Scanner;

public class xx123 {
    public static void main(String[] args) {
        Scanner qq = new Scanner(System.in);
        String ww = qq.nextLine();
        int AA=0;
        int aa=0;
        int nn=0;
        for(int i=0;i<ww.length();i++){

            if(ww.charAt(i)>='A'&&ww.charAt(i)<='Z'){
                AA +=1;
            }
            if(ww.charAt(i)>='a'&&ww.charAt(i)<='z'){
                aa +=1;
            }
            if(ww.charAt(i)>='0'&&ww.charAt(i)<='9'){
                nn +=1;
            }
        }
        System.out.println("大写字母"+AA);
        System.out.println("小写字母"+aa);
        System.out.println("数字"+nn);
    }
}
