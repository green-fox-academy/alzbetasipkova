package Sharpie;

public class Main {
    public static void main(String[] args) {

        Sharpie one = new Sharpie("pink", 40);


        one.use();

        System.out.println("This sharpie has color " + one.color + ", width " + one.width + " and the ink amount is " + one.inkAmount);
    }
}
