package Animal;

public class Main {

    public static void main(String[] args) {

        Animal pig = new Animal();
        Animal dog = new Animal(45, 60);

        pig.drink();
        dog.eat();
        dog.play();


        System.out.println(pig.thirst);
        System.out.println(dog.hunger);
        System.out.println(dog.thirst);

    }

}






   /* Create an Animal class
Every animal has a hunger value, which is a whole number
                Every animal has a thirst value, which is a whole number
                when creating a new animal object these values are created with the default 50 value
        Every animal can eat() which decreases their hunger by one
        Every animal can drink() which decreases their thirst by one
        Every animal can play() which increases both by one

    */