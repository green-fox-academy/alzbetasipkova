package TheGardenApplication;

import java.util.ArrayList;

public class Garden {

    ArrayList<Plant> kytky = new ArrayList<>();


    public void adding(Plant plant){
        kytky.add(plant);


    }

    public void wateringThePlants(double amount){
        int amountOfThsyPats = 0;
        for ( Plant plant : kytky ) {
            if (plant.isThirsy()) {
               amountOfThsyPats++;
            }
        }

        for ( Plant plantToWater : kytky) {
            plantToWater.watering(amount / amountOfThsyPats);
        }
    }

    public void status(){
        for ( Plant robert : kytky ) {
            System.out.println("The " + robert.color + " " + robert.type + " " + (robert.isThirsy() ? "needs water" : "doesn't need water"));

        }
    }
}

