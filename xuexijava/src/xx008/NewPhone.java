package xx008;

public class NewPhone extends Phone {
    public void call(String name){
        System.out.println("给"+name+"视频");  //新功能
        super.call(name);  //沿袭父类的功能
    }
}
