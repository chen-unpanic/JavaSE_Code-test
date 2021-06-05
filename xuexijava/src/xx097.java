import java.util.Scanner;
public class xx097 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        //获得任意长度的数组
        System.out.println("请输入数组长度");
    int w = q.nextInt();
    int[] shuzu= new int[w];
    //利用for循环输入数组内的元素
        System.out.println("请输入数组内元素");
    for(int i=0;i< shuzu.length;i++){
        int e = q.nextInt();
        shuzu[i]=e;
    }
        System.out.println("输入的数组为");
        System.out.print("[");
        for(int t=0;t<shuzu.length;t++){
            if(t== shuzu.length-1){
                System.out.println(shuzu[t]+"]");
            } else {
                System.out.print(shuzu[t]+",");
            } }
        //前K项交换
        System.out.println("请输入决定交换前几项");
    int k= q.nextInt();
    int c = 0;
    int v = k-1;
    while (c<=v){
        int m = shuzu[c];
        int n = shuzu[v];
        shuzu[v] = m;
        shuzu[c] = n;
        c++;
        v--;
    }
        //输出交换后的前K项
        System.out.println("交换后的数组为");
        System.out.print("[");
        for(int m=0;m<shuzu.length;m++){
        if(m== shuzu.length-1){
            System.out.print(shuzu[m]+"]");
        } else {
            System.out.print(shuzu[m]+",");
        }
        }
    }
}
