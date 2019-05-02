package TheGardenApplication;

public class Main {

    public static void main(String[] args) {

        Garden garden = new Garden();
        garden.adding(new Flower("yellow"));
        garden.adding(new Flower("blue"));
        garden.adding(new Tree("purple"));
        garden.adding(new Tree("orange"));

        garden.status();

        garden.wateringThePlants(40);

        garden.status();

        garden.wateringThePlants(70);

        garden.status();


    }



}
