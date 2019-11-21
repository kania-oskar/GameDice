import java.util.*;

public class PIOGame {

    public static void main(String[] args) {

        List <String> list = new ArrayList();

        list.add("raz");
        list.add("dwa");
        list.add("trzy");

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

        for (Iterator it = list.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }


//        Game game = new Game();
//
//        Player player = new PlayerComp();
//        game.addPlayer(player);
//
//        game.play();
    }
}
