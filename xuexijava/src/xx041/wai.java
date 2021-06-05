package xx041;

public class wai {  //定义类
    private int i = 100;
    public class nei{    //定义类
        int ii = 101;
        public void show(){   //定义方法
            int iii = 102;
            //System.out.println(i);
            System.out.println(ii);
            System.out.println(iii);
        }
    }
    public void show2(){
        nei n = new nei();
        n.show();
    }
}
