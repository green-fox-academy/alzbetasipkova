package restaurant;

import java.util.Arrays;
import java.util.HashMap;

public class Chef extends Employee {

    HashMap<String, Integer> mealCookings = new HashMap<>();

    public Chef(String name, int experience) {

        super(name, experience);


    }

    public Chef(String name){
        super(name);
    }

    public void work() {
        this.experience++;
        cook("meat balls");
    }

    public void cook(String meal) {
        if (mealCookings.containsKey(meal)) {
            mealCookings.put(meal, mealCookings.get(meal) + 1);
        } else {
            mealCookings.put(meal, 1);
        }
    }

    public void printMeals() {
        System.out.println(Arrays.toString(mealCookings.entrySet().toArray()));
    }
}
