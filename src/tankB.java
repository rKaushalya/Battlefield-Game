import java.util.Random;

public class tankB implements wepon{
    int score;
    @Override
    public void shoot() {
        Random r = new Random();
        score = r.nextInt(10);
        getScore();
    }

    @Override
    public void getScore() {
        playerBWeponStore p2 = new playerBWeponStore();
        p2.getTotal(score);
    }
}
