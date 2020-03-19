import java.util.Random;
public class Dice {
    private Random r;
    Dice(){
        r = new Random();
    }
    int roll(){
        return r.nextInt(6)+1;
    }
}