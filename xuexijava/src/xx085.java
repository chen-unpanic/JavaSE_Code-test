public class xx085 {
    public static void main(String[] args) {
        int[] shuzu = {12, 42, 643, 8756, 432, 8756, 432, 754, 785};
        getMax(shuzu);
        int a = getMax(shuzu);
        System.out.println(a);
    }

    public static int getMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i <= arr.length - 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
//        System.out.println(max);
        return max;
    }
}
