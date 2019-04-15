public class matrix {
    public static void main (String[] args){

    int[][] matrixDimensional = new int [4][4];

    int size = 4;

        for (int row = 0; row < size ; row +=1) {

            for (int column = 0; column < size; column++) {



                if (row == column) {

                    System.out.print("0");
                }
                else {
                    System.out.print("1");
                }
            }

            System.out.println();
        }
    }

}



// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output