public class BiggestNumber {
    public static void main(String[] args) {
        int[] numbers = {0, 10, 5, 8, 2, 9};

        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
    }
}
