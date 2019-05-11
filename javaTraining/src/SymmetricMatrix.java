public class SymmetricMatrix {
    public static void main(String[] args) {

        int matrixOne[][] = {{1, 0, 1},
                {0, 2, 2},
                {1, 2, 5}};

        int matrixTwo[][] = {{7, 7, 7},
                {6, 5, 7},
                {1, 2, 1}};

        if (isSymmetric(matrixOne, 3))
            System.out.println("This matrix is symmetric.");
        else
            System.out.println("This matrix isn't symmetric.");

        if (isSymmetric(matrixTwo, 3))
            System.out.println("This matrix is symmetric.");
        else
            System.out.println("This matrix isn't symmetric.");
    }

    int a = 100;

    public static boolean isSymmetric(int matrix[][], int s) {
        for (int i = 0; i < s; i++)
            for (int j = 0; j < s; j++)
                if (matrix[i][j] != matrix[j][i])
                    return false;
        return true;
    }
}



