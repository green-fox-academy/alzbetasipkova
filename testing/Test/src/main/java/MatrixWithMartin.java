import java.util.Arrays;

class MatrixWithMartin {

    public static void main(String[] args) {

        int[][] matrix = {{1, 3, 6, 2},
                {7, 5, 6, 1},
                {3, 3, 1, 5},
                {9, 0, 5, 3}};

        printMatrix(matrix);
    }

    public static int [][] multiplyMatrix(int [][] inputMatrix) {

        int [][] multipliedMatrix = new int[inputMatrix.length][inputMatrix[0].length];
        for (int x = 0; x < inputMatrix.length; x++) {
            int[] row = inputMatrix[x];
            for (int y = 0; y < row.length; y++) {
                boolean isRowOdd = x % 2 != 0;
                boolean isRowEven = !isRowOdd;
                boolean isNumOdd = inputMatrix[x][y] * 2 % 2 != 0;
                boolean isNumEven = !isNumOdd;
                if ((isRowOdd && isNumOdd) || (isRowEven && isNumEven)) {
                    multipliedMatrix[x][y] = inputMatrix[x][y] * 2;
                } else {
                    multipliedMatrix[x][y] = inputMatrix [x][y];
                }


            }
        }

        return multipliedMatrix;
    }

    public static void printMatrix(int [][] inputMatrix) {

        for (int x = 0; x < inputMatrix.length; x++) {
            System.out.println(Arrays.toString(inputMatrix[x]));
        }
    }
}
