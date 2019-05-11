package pirates;

public class Pirate {

    protected String name;
    protected int amountOfGold = 10;
    protected int healthPoints = 10;
    protected boolean hasWoodenLeg;
    protected boolean isCaptain;

    public Pirate(String name, int amountOfGold, int healthPoints, boolean isCaptain, boolean hasWoodenLeg) {

        this.name = name;
        this.amountOfGold = amountOfGold;
        this.healthPoints = healthPoints;
        this.isCaptain = false;
        this.hasWoodenLeg = false;

    }

    public void work() {

        if (isCaptain) {
            amountOfGold += 10;
            healthPoints -= 5;
        } else {
            amountOfGold +=1;
            healthPoints -=1;
        }
    }

    public void party() {

        if (isCaptain) {
            healthPoints += 10;
        } else {
            healthPoints +=10;
        }
    }

    public String toString() {

        if (isCaptain) {
            return "Hello, " + name + ". I have a wooden leg and " + amountOfGold + " golds.";
        }else {
          return  "Hello, " + name + ". I still have my real legs and " + amountOfGold + " golds.";
        }
    }
}


/*
A pirate has a name, an amount of gold and health points, the default value of which is 10.

A pirate might be a captain and may have a wooden leg.

You must create the following methods:

if a pirate is a captain:

work() which increases the amount of gold possessed by that pirate by 10 and decrease the HP by 5.
party() which increases the HP by 10.
if the pirate is not a captain:

work() which increases the amount of gold by 1 and decreases the HP by 1.
party() which increases the HP by 1.
toString() method:

if the pirate has a wooden leg, then the string that is returned by the function must look like this:

Hello, I'm Jack. I have a wooden leg and 20 golds.
If not:

Hello, I'm Jack. I still have my real legs and 20 golds.

 */