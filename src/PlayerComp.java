import java.util.Random;

public class PlayerComp extends Player{

    private Random brain = new Random();

    public PlayerComp() {
    }

    public PlayerComp(String name) {
        super(name);
    }

    public int guess(){
        return brain.nextInt(6)+1;
    }
}
