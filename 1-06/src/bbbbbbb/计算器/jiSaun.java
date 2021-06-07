package bbbbbbb.计算器;
//接口类 里面包含加减乘除四个方法 ，通过一个类去计算，  主方法去计算各自逻辑运算，然后主方法调方法，
public  class jiSaun implements jiSuanFangFa {
    private int a;
    private int b;

    public jiSaun() {
    }

    public jiSaun(int a, int b) {
        this.a = a;
        this.b = b;
    }



    @Override
    public void jiafa() {
        int c = a+b;
        System.out.println(a+"+"+b+"="+c);
    }

    @Override
    public void jianfa() {
        int c = a-b;
        System.out.println(a+"-"+b+"="+c);
    }

    @Override
    public void chengfa() {
        int c = a*b;
        System.out.println(a+"x"+b+"="+c);
    }

    @Override
    public void chufa() {
        float c = a/b;
        System.out.println(a+"/"+b+"="+c);
    }
}
