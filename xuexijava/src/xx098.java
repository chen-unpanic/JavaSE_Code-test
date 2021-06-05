import java.util.Scanner;

public class xx098 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.println("请输入六位评委给的得分");
        int e1 = q.nextInt();
        int e2 = q.nextInt();
        int e3 = q.nextInt();
        int e4 = q.nextInt();
        int e5 = q.nextInt();
        int e6 = q.nextInt();
        System.out.println("六位评委分别给的分数为" + " " + e1 + " " + e2 + " " + e3 + " " + e4 + " " + e5 + " " + e6);
        int[] shuzu = {e1, e2, e3, e4, e5, e6};
        getSum(shuzu);
        getMax(shuzu);
        getMin(shuzu);
        float finail = (float) (getSum(shuzu) - getMax(shuzu) - getMin(shuzu)) / 4;
        System.out.println(finail);
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
