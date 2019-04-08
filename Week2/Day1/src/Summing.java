public class Summing {

    public static void main(String[] args) {

        int num = 3;
        int result = sum(num);
        System.out.println(result);
    }

    public static int sum(int x) {

        int a = 0;
        for (int i = 0; i <= x; i++) {

            a += i;
        }
        return a;
    }
}

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter
