package xx039;

public class PlayerTest {
    public static void main(String[] args) {
        PlayerOpe yy = new PlayerOpe();
        Player akkk = new BskPly();
        yy.usePlayer(akkk);

        Player yy1 = new Player() {
            @Override
            public void training() {
                System.out.println("训练");
            }

            @Override
            public void rest() {
                System.out.println("休息");
            }
        };
        yy1.rest();
        yy1.training();

        Player dasdasda = yy.getplayer();
        dasdasda.training();
        dasdasda.rest();
    }
}
