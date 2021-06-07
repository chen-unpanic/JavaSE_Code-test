package bbbbbbb.冒泡序列;

public class MaoPaoXuLie {
    public static void main(String[] args) {
        int[] shuzu = {31, 435, 653, 312, 42, 124, 756, 123, 1, 4, 23, 52, 6754};
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < shuzu.length -1- i; j++) {
                if(shuzu[j]>shuzu[j+1])
                {int temp = shuzu[j];
                shuzu[j] = shuzu[j + 1];
                shuzu[j + 1] = temp;}
            }
        }
        System.out.print("[");
        for(int i =0;i< shuzu.length;i++){
            if(i== shuzu.length-1){
                System.out.print(shuzu[i]+"]");
            } else {
            System.out.print(shuzu[i]+",");
        }
        }
        // shuzu.shuzushuzu  方法不能用
    }
    //这个方法怎么调不了
    public static void shuchushuzu(int[] sz){
        System.out.print("[");
        for(int i =0;i< sz.length;i++){
            System.out.print(sz[i]+",");
        }
        System.out.print("]");
    }
}
