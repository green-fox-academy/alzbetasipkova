import java.util.ArrayList;
import java.util.List;

public class ListIntroductionOne {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(); //creates new list

        names.add("William "); //Add William to the list

        if (names.contains(0)) {
            System.out.println("The list is empty!" );
        } else System.out.println("The list has some content");   //Print out whether the list is empty or not

        names.add("John " ); //Add John and Amanda to the list
        names.add("Amanda");

    //System.out.println(names.size()); - Prints out the number of elements in the list

       // System.out.println(names.get(2)); - Prints out the 3rd element

       // for (String object: names) {
           // System.out.println(object); - Iterate through the list and print out each name

            for (int i = 0; i < names.size(); i++) {
            //    System.out.println((i+1) + ". " + (names.get(i))); - Iterate through the list and print

            }
            names.remove(1); // removes 2nd element
        System.out.println(names);

        }
    }


