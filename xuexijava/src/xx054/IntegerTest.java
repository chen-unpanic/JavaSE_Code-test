package xx054;

public class IntegerTest {
    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        System.out.println(i1);  //没有输出i1地址信息，说明重写了toString的方法
        /*Integer i2 = new Integer("中国");*/
        Integer i3 = new Integer("100");
        /*System.out.println(i2);*/
        System.out.println(i3);
        Integer i4 = Integer.valueOf(100);
        System.out.println(i4);
        Integer i5 = Integer.valueOf("10000");
        System.out.println(i5);

        System.out.println(Integer.valueOf(20));
        System.out.println(Integer.valueOf("200"));
    }
}
