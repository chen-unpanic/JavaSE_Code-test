package xx006;

public class zi extends fu {
    public void method(){
        System.out.println("子中method方法");
    }
    public void show(){
        System.out.println("子中show方法");
        super.show();
    }
}
