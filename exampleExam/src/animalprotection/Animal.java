package animalprotection;

public class Animal {

    private String ownerName;
    private boolean isHealthy;
    private int healCost;
    private String name;

    public Animal(String ownerName, boolean isHealthy, int healCost, String name){

        this.ownerName = ownerName;
        this.isHealthy = isHealthy;
        this.healCost = healCost;
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getHealCost() {
        return healCost;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void heal(){
        isHealthy = true;
    }

    public boolean isAdoptable(){

        if (isHealthy) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {

        if (isHealthy == false) {
            return (name + " is not healthy " + healCost + ", and not adoptable");
        } else {
            return (name + " is healthy, and adoptable.");
        }
    }



}

