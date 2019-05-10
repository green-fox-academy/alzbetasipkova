package onlinebettingsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {

    private String name;
    private int account;
    private ArrayList<Bet> betList = new ArrayList<>();


    public void makeBet(Contestant contestant, int amount) {

        int betId = (new Random().nextInt(9999-1000)+1000);
        Bet bet = new Bet(betId, amount, this, contestant);

        if (this.account >= amount){
            betList.add(bet);
        }
    }
}



