package testing;

public class Main {
    public static void main(String[] args) {


        double ratio = getRatio(3, 2);
        System.out.println(ratio);

    }

    public static double getRatio(int divident, int divisor){

        if (divisor == 0){
            return 0;
        }

        return divident/divisor;
    }
}