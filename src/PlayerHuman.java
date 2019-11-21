import java.util.Scanner;

public class PlayerHuman extends Player{

    Scanner scanner = new Scanner(System.in);

    public PlayerHuman() {}

    public PlayerHuman(String name) {
        super(name);
    }

    public int guess(){
        System.out.println("Wpisz liczbe: ");
        return scanner.nextInt();
    }
}
