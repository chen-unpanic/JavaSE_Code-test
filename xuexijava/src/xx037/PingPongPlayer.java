package xx037;

public class PingPongPlayer extends Player implements SpeakEnglish{
    public PingPongPlayer() {
    }

    public PingPongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void pee() {
        System.out.println("乒乓球运动员要拉尿");
    }

    @Override
    public void study() {
        System.out.println("劳资搞乒乓球");
    }

    @Override
    public void SE() {
        System.out.println("老子学乒乓球的学你妈的英语");
    }
}
