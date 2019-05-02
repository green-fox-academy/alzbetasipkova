package AircraftCarrier;

import java.util.ArrayList;

public class Carrier {

    int storeOfAmmo;
    int healthPoints;

    ArrayList<Aircrafts> planes = new ArrayList<>();


    public Carrier(int storeOfAmmo, int healthPoints) {

        this.storeOfAmmo = storeOfAmmo;
        this.healthPoints = healthPoints;
    }

    public void adding(Aircrafts plane) {
        planes.add(plane);
    }

    public void fill() throws Exception {

        if (storeOfAmmo == 0) {
            throw (new Exception());
        }

        int sumOfMissing = 0;

        for (Aircrafts aircraft : planes) {

            int missing = aircraft.maxAmmo - aircraft.ammoStorage;
            sumOfMissing = sumOfMissing + missing;
        }

        //dont have enough
        if (storeOfAmmo < sumOfMissing) {
            for (Aircrafts aircraft : planes) {
                if (aircraft.isPriority()) {
                    storeOfAmmo = aircraft.refill(storeOfAmmo);
                }
            }

            if (storeOfAmmo < sumOfMissing) {
                for (Aircrafts aircraft : planes) {
                    if (!aircraft.isPriority()) {
                        storeOfAmmo = aircraft.refill(storeOfAmmo);
                    }
                }
            }
        } else {
            for (Aircrafts aircraft : planes) {
                storeOfAmmo = aircraft.refill(storeOfAmmo);
            }


        }


    }

    public void fight(Carrier enemy){
        for ( Aircrafts aircraft : planes ) {
           int damage = aircraft.fight();
           enemy.healthPoints -= damage;

        }
    }

    public String getStatus()
}
