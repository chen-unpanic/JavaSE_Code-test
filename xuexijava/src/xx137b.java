import java.util.ArrayList;

public class xx137b {
    public static void main(String[] args) {
        ArrayList<xx137a> al = new ArrayList<>();  //放的是类，不是String类型
        xx137a c1 = new xx137a("华硕",1552);
        xx137a c2 = new xx137a("联想",4399);
        xx137a c3 = new xx137a("戴尔",5799);
        //添加电脑类对象到集合中
        al.add(c1);
        al.add(c2);
        al.add(c3);
        for(int i = 0; i < al.size();i++){
            xx137a xx = al.get(i);
            System.out.println(xx.getBrand()+"     "+xx.getPrice());
        }
    }
}
