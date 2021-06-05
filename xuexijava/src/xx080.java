public class xx080 {
    public static void main(String[] args) {
        sum(10, 20);
        int reuslt1 = sum(10, 20);
        System.out.println(reuslt1);
        System.out.println("-------分割线-----------");
        sum(10, 20, 30);
        int reult2 = sum(10, 20, 30);
        System.out.println(reult2);
        System.out.println("--------分割线----------");
        sum(2.3, 3.9);
        double reult3 = sum(2.3, 3.9);
        System.out.println(reult3);
        System.out.println("--------分割线----------");
        sum(2.3, 3.9);
        float reult4 = (float) sum(2.3, 3.9);  //强制类型转换
        System.out.println(reult4);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }
}
