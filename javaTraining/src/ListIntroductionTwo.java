import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroductionTwo {
    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
        ArrayList<String> listB = new ArrayList<>();
        listB.addAll(listA);

        System.out.println(listA.contains("Durian"));

        listB.remove("Durian");
        listA.add(4, "Kiwifruit");

        if (listA.size() > listB.size()) {
            System.out.println("List A has more items.");
        } else {
            System.out.println("List B has more items.");
        }

        listA.indexOf("Avocado");
        listB.indexOf("Durian");

        listB.add("Passion Fruit");

        System.out.println(listA.get(4));
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