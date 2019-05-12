package cloneable;

public class Main {
    public static void main(String[] args) {

        Student john = new Student("John", 20, "male", "BME");
        john.clone(john);
    }
}

/*
Instantiate John, a 20 years old male from BME
Clone him into jonhTheClone
 */