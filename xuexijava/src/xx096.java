import java.util.Scanner;

public class xx096 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int w = q.nextInt();
        int[] shuzu={1,2,3,4,5,6,7,8,9,0};
        int index = -1;
        for(int i=0;i< shuzu.length;i++){
            if(w==shuzu[i]){
                index =i;
            }

        }
        System.out.println(index);
    }
}
