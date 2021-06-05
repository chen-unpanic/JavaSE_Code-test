package xx055;

public class intANDstring {
    public static void main(String[] args) {
        //int - String
        int number = 10000;

        //方法1
        String s1 = ""+number;
        System.out.println("int - String"+"方法1"+"   "+s1);
        System.out.println("-----");

        //方法2
        String s2 = String.valueOf(number);
        System.out.println("int - String"+"方法2"+"   "+s2);
//--------------------------------------------------------------------------------------
        //String - int
        String s3 = "31415926";

        //方法1
        Integer i = Integer.valueOf(s3);
        int i1 = i.intValue();
        System.out.println("String - int"+"方法1"+"     "+i1);
        System.out.println("-----");

        //方法2
        int i2 = Integer.parseInt(s3);
        System.out.println("String - int"+"方法1"+"     "+s3);
    }
}
