package Pirate;

public abstract class Pirate {

   private String name;
   private int amountGold = 10;
   private int healthPoints = 10;
   private boolean hasWoodenLeg = true;


   public Pirate(String name, boolean hasWoodenLeg){

       this.name = name;
       this.hasWoodenLeg = hasWoodenLeg;

   }

    public abstract void work();


    public abstract void party();


    public String toString(){

        return (hasWoodenLeg == true ? "Hello, I'm" + name + " . I have a wooden leg and " + amountGold + " golds. (HEALTH POINT: " + healthPoints + ")"
                : "Hello, I'm " + name + ". I still have my real legs and " + amountGold + " golds. (HEALTH POINT: " + healthPoints + ")");


    }



}
