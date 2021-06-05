public class xx095 {
    public static void main(String[] args) {
        int[] shuzu1 = {11, 22, 33, 44, 55, 66};
        int[] shuzu2 = {11, 22, 33, 44, 55, 66};
        int[] shuzu3 = {11, 22, 33, 44, 55, 67};
        compare(shuzu1, shuzu2);
        System.out.println(compare(shuzu1, shuzu2));
        compare(shuzu1, shuzu3);
        System.out.println(compare(shuzu1, shuzu3));
    }

    public static boolean compare(int[] sz1, int[] sz2) {
        if (sz1.length != sz2.length) {
            return false;
        }
        for (int i = 0; i < sz1.length; i++) {
            if (sz1[i] != sz2[i]) {
                return false;
            } }
                return true;

        }

}
