public class swapElements {
    public static void main (String[] args){

        String[] abc = {"first", "second", "third"};


        String f = abc[0];
        abc[0] = abc[2];
        abc[2] = f;

        for (String numbers : abc) {

            System.out.println(numbers);

        }
    }
}




// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`