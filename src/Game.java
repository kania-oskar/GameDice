import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Game {
    private Random dice = new Random();

    private List<Player> players = new ArrayList();


    public void addPlayer(Player player) {
        for(Player playerCheck : players){
            if (player.getName().equals(playerCheck)) {
                player.setName(player.getName()+dice.nextInt());

            }
        }

        players.add(player);
    }

    public void printPlayers(){
        for(Player player : players) {
            System.out.println(player.getName());
        }
    }

    public void removePlayer(String name) {
        for (Iterator<Player> it = players.iterator(); it.hasNext(); ){
            Player player = it.next();
            if (player.getName().equals(name)) {
                it.remove();
            }
        }
    }

    public void play() {

        int number;
        int guess;
        boolean repeat;

        do {
            System.out.println("____________________");

            repeat = true;

            number = dice.nextInt(6) + 1;
            System.out.println("Wylosowana: " + number);


            for(Player player : players) {
                guess = player.guess();
                System.out.println(player.getName() + " odgaduje: " + guess);

                if (number != guess) {
                    System.out.println("Żle!");
                } else {
                    System.out.println("Brawo!");
                    repeat = false;
                }
            }
        } while (repeat);
    }
}
