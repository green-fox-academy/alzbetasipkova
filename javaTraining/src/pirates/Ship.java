package pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    List<Pirate> listOfPirates = new ArrayList<>();

    public void addPirate(Pirate pirate) {
        if (pirate.isCaptain) {
            for (Pirate getCaptain : listOfPirates) {
                if (getCaptain.isCaptain) {
                    return;
                }
            }
        }
        listOfPirates.add(pirate);
    }


    public List<String> getPoorPirates() {

        List<String> names = new ArrayList<>();
        for (Pirate poorPirate : listOfPirates) {
            if (poorPirate.hasWoodenLeg && poorPirate.amountOfGold < 15) {
                names.add(poorPirate.name);
            }
        }

        return names;
    }

    public int getGolds() {

        int gold = 0;
        for (Pirate piratesGold : listOfPirates) {
            gold += piratesGold.amountOfGold;
        }
        return gold;
    }

    public void lastDayOnTheShip() {
        for (Pirate pirates : listOfPirates) {
            pirates.party();
        }
    }

    public void prepareForBattle() {
        for (Pirate pfb : listOfPirates) {
            for (int i = 0; i < 5; i++) {
                pfb.work();
            }
        }

        lastDayOnTheShip();

    }
}

