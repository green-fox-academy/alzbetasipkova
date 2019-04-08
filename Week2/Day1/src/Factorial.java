import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number: ");
        int num = scanner.nextInt();

        int result = sum(num);
        System.out.println(result);
    }

    public static int sum(int x) {

        int y = 1;
        for (int i = 1; i <= x; i++) {

            y *= i;
        }
        return y;
    }
}
