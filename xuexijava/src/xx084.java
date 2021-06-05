public class xx084 {
    public static void main(String[] args) {
        int[] shuzu = {111, 222, 333, 444, 555, 666};
        bianli(shuzu);
    }

    public static void bianli(int[] arr) {
        System.out.print("[");
        for (int i = 0; i <= arr.length; i++) {
            if (i == arr.length-1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("]");

    }
}
