import java.util.Random;

public class bomb implements wepon{
    int score;
    public void shoot(){
        Random r = new Random();
        score = r.nextInt(10);
        getScore();
    }

    @Override
    public void getScore() {
        playerAWeponStore p1 = new playerAWeponStore();
        p1.getTotal(score);
    }
}
