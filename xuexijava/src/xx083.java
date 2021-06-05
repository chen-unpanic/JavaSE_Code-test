public class xx083 {
    public static void main(String[] args) {
        int[] shuzu = {1, 2, 3};
        System.out.println(shuzu);
        System.out.println(shuzu[1]);
        System.out.println("------fen ge xian ---------");
        change(shuzu);
        System.out.println(shuzu);
        System.out.println(shuzu[1]);

    }

    public static void change(int[] arr) {
        arr[1] = 20;
    }
}
