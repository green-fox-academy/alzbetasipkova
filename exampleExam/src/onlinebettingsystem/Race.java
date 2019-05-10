package onlinebettingsystem;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private List<Contestant> contestants = new ArrayList<>();
    private List<Player> players = new ArrayList<>();


    public void startRace(){

        List<Integer> placement = new ArrayList<>();

        for (int i = 0; i < contestants.size() ; i++) {
            placement.add(i+1);
        }


        for ( Contestant contes : contestants) {
            int random = (int)Math.random()*placement.size();
            contes.setPlacement(placement.get(random));
            placement.remove(placement.get(random));
        }

    }

    @Override
    public String toString() {
     String text = ""
    }
}

/*
Create a Race class. This class will simulate a race. It has 2 private fields which must be set through the constructor.
contestants - it will store all of the contestants attending the race
players - it will store all of the players
and 1 public method
startRace() - this will simulate a race
first you need to evaluate the race by setting the placement field of the contestants to a random number (1 <= x <= contestants.length)
please keep in mind that every contestant's placement should be unique
after the evaluation, write the placements to the console in increasing order (use the toString() method)
to keep things simple a bet is won if the contestant won the race and the player will win the double price of the money he made the bet with
finally you need to write the winners to the console in the following format
{name} has won {money}$ with the bet: {betId}

*/