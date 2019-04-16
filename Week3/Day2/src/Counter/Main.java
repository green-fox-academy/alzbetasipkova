package Counter;

public class Main {

    public static void main(String[] args) {

        Counter pocitadlo = new Counter(9);
        pocitadlo.add(3);
        pocitadlo.add(6);

        int newNumber = pocitadlo.get();

        System.out.println(newNumber);

        pocitadlo.reset();

        System.out.println(pocitadlo.get());

//        Counter.callThePolice();
        pocitadlo.callThePolice();
    }



}
