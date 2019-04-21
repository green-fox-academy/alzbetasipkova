import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroductionTwo {
    public static void main(String[] args) {

   // Create a list ('List A') which contains the following values:  Apple, Avocado, Blueberries, Durian, Lyche
    ArrayList<String> listA = new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));

    // Create a new list ('List B') with the values of List A
    ArrayList<String> listB = new ArrayList<>();

        listB.addAll(listA);

        System.out.println(listA.contains("Durian"));

        listB.remove("Durian");
        listA.add(4, "Kiwifruit ");


        //Compare the size of List A and List B
        if (listA.size() > listB.size()) {
            System.out.println("List A is wider");
        } else {
            System.out.println("List B is wider");
        }

        listA.indexOf("Avocado"); //Get the index of Avocado from List A

        // Add Passion Fruit and Pummelo to List B in a single statement
        listB.addAll(0, Arrays.asList("Passion Fruit", "Pummelo"));
        System.out.println(listB);

        // Print out the 3rd element from List A
        System.out.println(listA.get(2));

    }
}


/*
Create a list ('List A') which contains the following values
Apple, Avocado, Blueberries, Durian, Lychee
Create a new list ('List B') with the values of List A
Print out whether List A contains Durian or not
Remove Durian from List B
Add Kiwifruit to List A after the 4th element
Compare the size of List A and List B
Get the index of Avocado from List A
Get the index of Durian from List B
Add Passion Fruit and Pummelo to List B in a single statement
Print out the 3rd element from List A
 */