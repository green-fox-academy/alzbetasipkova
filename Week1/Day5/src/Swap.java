public class Swap {
    public static void main (String[] args){

        int a = 123;
        int b = 526;

        System.out.println(a);
        System.out.println(b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}

        // Swap the values of the variables