package 学习104;

public class xx003a extends xx003b {
    public int age = 20 ;
    public int height = 175;
    public void son(){
        int height = 170;
        System.out.println("age"+age);
        System.out.println("height"+height);
        System.out.println("this.heiht"+this.height);
        System.out.println(super.height);
    }
}
