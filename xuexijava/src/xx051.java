import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class xx051 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int[] shuzu = new int[b];
        for(int i = 0;i<shuzu.length;i++){
            int c = a.nextInt();
            shuzu[i]=c;
        }
        paixu(shuzu);

        System.out.println("---------------");
        System.out.println(Arrays.toString(shuzu));
        Arrays.sort(shuzu);
        System.out.println(Arrays.toString(shuzu));

    }
    public static void paixu(int[] shuzu){
        System.out.println("今晚要打老虎"+outshuzu(shuzu));
        for(int x=0;x<shuzu.length;x++){
            for(int y =0;y<shuzu.length-1-x;y++){
                if(shuzu[y]>shuzu[y+1]){
                    int temp = shuzu[y];
                    shuzu[y]=shuzu[y+1];
                    shuzu[y+1]=temp;

                }
            }
            if(x<= shuzu.length-2){
                System.out.println("第"+(x+1)+"次排序后"+outshuzu(shuzu));}
        }
        System.out.println("最终排序结果"+outshuzu(shuzu));
    }
    public static String outshuzu(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0;i < arr.length;i++){
            if(i == arr.length -1 ){
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append((","));
            }
        }
        sb.append("]");
        String s = sb.toString();
        return  s;
    }
}
