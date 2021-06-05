package xx044;

public class wai {  //外部类
    public void method(){  //外部类方法
        jiekou i = /*dsadsa  */ new jiekou(){  //匿名内部类
            public void show(){  //匿名内部类方法
                System.out.println("匿名内部类");
            }
        };
        i.show();  //调重写方法
    }
}
