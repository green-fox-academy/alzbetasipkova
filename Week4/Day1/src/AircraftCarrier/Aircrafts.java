package AircraftCarrier;

public class Aircrafts {

    String type;
    int maxAmmo;
    int ammoStorage;
    int baseDamage;


    public Aircrafts(String type, int maxAmmo, int ammoStorage, int baseDamage){

        this.type = type;
        this.maxAmmo = maxAmmo;
        this.ammoStorage = ammoStorage;
        this.baseDamage = baseDamage;
    }

    public int fight(){
        int damage = baseDamage * ammoStorage;
        ammoStorage = 0;
        return damage;
    }

    public int refill(int amount){

        ammoStorage = maxAmmo;
        amount = amount - maxAmmo;
        return amount;

    }

    public String getType(String type){

        return "The type of the aircraft is " + type;
    }

    public String getStatus(){

        return "Type: " + type + ", " + "Ammo: " + ammoStorage + ", " + "Base Demage: " + baseDamage + ", " +
                  "All damage: " + ;
    }

    public boolean isPriority(){

        if (type.equals("F35"))
            return true;
        else {
            return false;
        }
    }
}
