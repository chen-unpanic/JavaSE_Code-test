package xx037;

public class PingPongCoach extends Coach implements SpeakEnglish{
    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void pee() {
        System.out.println("乒乓球教练撒尿");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球运动员教学乒乓球");
    }

    @Override
    public void SE() {
        System.out.println("乒乓球教练要学说英语");
    }
}
