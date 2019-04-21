import java.util.HashMap;

public class MapIntroductionOne {
    public static void main(String[] args) {


        HashMap<Integer, Character> mapOne = new HashMap<>();
        //System.out.println(mapOne.isEmpty()); prints out whether the map is empty or not

        mapOne.put(97, 'a');
        mapOne.put(98, 'b');
        mapOne.put(99, 'c');
        mapOne.put(65, 'A');
        mapOne.put(66, 'B');
        mapOne.put(67, 'C');

        //System.out.println(mapOne.keySet()); Print all the keys
        //System.out.println(mapOne.values()); Print all the values

        mapOne.put(68, 'D');

        //System.out.println(mapOne.size()); Print how many key-value pairs are in the map

        //System.out.println(mapOne.get(99)); Print the value that is associated with key 99

        mapOne.remove(97);         //        Remove the key-value pair where with key 97

        System.out.println(mapOne.containsKey(100)); // whether there is an associated value with key 100 or not

        mapOne.clear(); //Remove all the key-value pairs
        System.out.println(mapOne);
    }
}

/*
We are going to play with maps. Feel free to use the built-in methods where possible.

Create an empty map where the keys are integers and the values are characters

Print out whether the map is empty or not

Add the following key-value pairs to the map

Key	Value
97	a
98	b
99	c
65	A
66	B
67	C
Print all the keys

Print all the values

Add value D with the key 68

Print how many key-value pairs are in the map

Print the value that is associated with key 99

Remove the key-value pair where with key 97

Print whether there is an associated value with key 100 or not

Remove all the key-value pairs
 */