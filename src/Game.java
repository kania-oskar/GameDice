import java.util.Random;

public class Game {

    private Player player;
    private Random dice = new Random();

    public void addPlayer(Player player) {
        this.player = player;

        /*try {
            player.setName("Oskar");
        } catch (IllegalArgumentException ex) {
             System.err.println("Błąd!" + ex.getMessage());
        }*/
    }

    public void play() {

        int number;
        int guess;

        do {
            System.out.println("____________________");

            number = dice.nextInt(6) + 1;
            System.out.println("Wylosowana: " + number);

            guess = player.guess();
            System.out.println(player.getName() + " odgaduje: " + guess);

            if (number != guess) {
                System.out.println("Żle!");
            }

        } while (guess != number);

        System.out.println("Brawo!");
    }
}
