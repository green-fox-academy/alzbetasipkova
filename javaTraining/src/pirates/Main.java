package pirates;

import pirates.Pirate;
import pirates.Ship;

public class Main {
    public static void main(String[] args) {

        Ship pirateShip = new Ship();

        pirateShip.addPirate(new Pirate("Bob", 9, 9, true, true));
        pirateShip.addPirate(new Pirate("Andre", 4, 2, false, false));
        pirateShip.addPirate(new Pirate("Lotr", 2, 5, false, false));


        pirateShip.prepareForBattle();
        System.out.println(pirateShip.getPoorPirates());
    }
}
