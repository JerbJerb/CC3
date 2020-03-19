import java.util.Random;
public class Dice {
    private Random r;
    Dice(){
        r = new Random();
    }
    int roll(){
        return r.nextInt(6)+1;
    }
    int rolll(){
    	return r.nextInt(10)+1;
    }
    int rollll(){
    	return r.nextInt(3)+1;
    }
    int rolllll(){
    	return r.nextInt(2)+1;
    }
}