package TheGardenApplication;

import java.util.ArrayList;

public class Plant {

    String type;
    double amountOfWater;
    String color;
    double neededWater;
    double absorbrate;


    public Plant(double neededWater, String color, double absorbrate, double amountOfWater, String type){

        this.neededWater = neededWater;
        this.color = color;
        this.absorbrate = absorbrate;
        this.amountOfWater = amountOfWater;
        this.type = type;
    }


    public void watering(double amount){
        amountOfWater += amount * absorbrate;
    }

    public boolean isThirsy(){

        if (neededWater < amountOfWater){
            return false;
        } else {
            return true;
        }
    }
}
