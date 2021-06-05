package xx039;

public class PlayerOpe {
    public void usePlayer(Player ydy){
        ydy.training();
        ydy.rest();
    }
    public Player getplayer(){
        Player pp = new BskPly();
        return pp;
    }
}
