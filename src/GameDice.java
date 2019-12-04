import java.util.*;

public class GameDice {

    public static void main(String[] args) {

        Game game = new Game();

        game.addPlayer(new PlayerComp("Janusz"));
        game.addPlayer(new PlayerComp("Janusz"));
        game.printPlayers();

//        game.removePlayer("Ziuta");
//        game.printPlayers();

//        game.play();


//        List <String> list = new ArrayList();
//
//        list.add("raz");
//        list.add("dwa");
//        list.add("trzy");
//
//        System.out.println("_________________");
//
//        System.out.println(list.toString());
//
//        System.out.println("_________________");
//
//        for (int i=0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
//        System.out.println("_________________");
//
//        for(Object el : list){
//            System.out.println(el);
//        }
//
//        System.out.println("_________________");
//
//        Iterator it = list.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//
//        for (Iterator it = list.iterator(); it.hasNext(); ) {
//            System.out.println(it.next());
//        }


    }
}
