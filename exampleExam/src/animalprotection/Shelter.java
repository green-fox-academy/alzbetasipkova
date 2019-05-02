package animalprotection;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class Shelter {

    int budget = 50;
    List<Animal> animalList = new ArrayList<>();
    List<String> ownerList = new ArrayList<>();


    public int rescue(Animal animal) {

        animalList.add(animal);
        return animalList.size();

    }

    public int heal() {
        for (Animal animal : animalList) {
            if (budget > animal.getHealCost() && !animal.isHealthy()) {
                animal.heal();
                return 1;
            }
        }
        return 0;
    }

    public void addAdopter(String ownerName) {

        ownerList.add(ownerName);
    }



    public void findNewOwner(){

        int randomAdopter = (new Random()).nextInt(ownerList.size());
        int randomAnimal = (new Random()).nextInt(animalList.size());

        ownerList.remove(randomAdopter);
        animalList.remove(randomAnimal);

    }

    public int earnDonation(int amount){

        budget += amount;
        return budget;
    }

    @Override
    public String toString() {
        String text = "Budget: " + budget + "€" + ", " + "\n" +
                "There are " + animalList.size() + "animal(s) and " + ownerList.size() + "potentional adopter(s).";

        for (Animal animal : animalList) {
            text += "\n" + animal.toString();
        }
        return text;
    }
}



//Budget: <budget>€,
  //      There are <animals.count> animal(s) and <potentionalAdopters.count> potential adopter(s)
//<name> is not healthy (<heal cost>€), and not adoptable
//<name> is healthy, and adoptable

