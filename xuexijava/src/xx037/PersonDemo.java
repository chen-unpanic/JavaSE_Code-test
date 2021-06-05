package xx037;

public class PersonDemo {
    public static void main(String[] args) {
        PingPongPlayer ppydy1 = new PingPongPlayer();
        ppydy1.setName("李大强");
        ppydy1.setAge(24);
        ppydy1.pee();
        ppydy1.SE();
        ppydy1.study();
        System.out.println(ppydy1.getName()+"-----"+ppydy1.getAge());
        System.out.println("我屌你妈的");
        PingPongPlayer ppydy2 = new PingPongPlayer("李二强",22);
        ppydy2.pee();
        ppydy2.SE();
        ppydy2.study();
        System.out.println(ppydy2.getName()+"-----"+ppydy2.getAge());
        System.out.println("我屌你妈的");
        BasketballPlayer lqydy1 = new BasketballPlayer();
        lqydy1.setName("姚大傻");
        lqydy1.setAge(38);
        lqydy1.pee();
        lqydy1.study();
        System.out.println(lqydy1.getName()+"-----"+lqydy1.getAge());
    }
}
