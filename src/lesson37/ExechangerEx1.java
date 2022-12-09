package lesson37;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExechangerEx1 {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.NOJNICI);
        friend1Action.add(Action.BUMAGA);
        friend1Action.add(Action.KAMEN);
        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.BUMAGA);
        friend2Action.add(Action.KAMEN);
        friend2Action.add(Action.BUMAGA);

        new BestFriend("Vanya", friend1Action, exchanger);
        new BestFriend("Petya", friend2Action, exchanger);
    }
}

enum Action {
    KAMEN, NOJNICI, BUMAGA;
}

class BestFriend extends Thread {
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> myExchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> myExchanger) {
        this.name = name;
        this.myActions = myActions;
        this.myExchanger = myExchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendsAction) {
        if((myAction == Action.KAMEN && friendsAction == Action.NOJNICI)
        || (myAction == Action.NOJNICI && friendsAction == Action.BUMAGA)
        || (myAction == Action.BUMAGA && friendsAction == Action.KAMEN)) {
            System.out.println(name + " Wins!!!");
        }
    }

    public void run() {
        Action replay;
        for(Action action : myActions) {
            try {
                replay = myExchanger.exchange(action);
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}