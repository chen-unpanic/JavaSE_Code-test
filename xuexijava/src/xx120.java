public class xx120 {
    public static void main(String[] args) {
        byte[] b ={97,98,99};
        String s1 = new String(b);
        String s2 = new String(b);
        System.out.print("s1和s2 ");
        System.out.println(s1==s2 );

        String s3 = "abc";
        String s4 = "abc";
        System.out.print("s1和s3 ");
        System.out.println(s1==s3);
        System.out.print("s3和s4 ");
        System.out.println(s3==s4);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
