import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {

        reversedOrder("/Users/bettynka/Desktop/GreenFox/alzbetasipkova/javaTraining/reversed-order.txt");

    }


    public static void reversedOrder(String fileName) {

        Path path = Paths.get(fileName);

        try {

            List<String> lines = Files.readAllLines(path);
            for (int i = lines.size() - 1; i >= 0; i--) {
                System.out.println(lines.get(i));
            }
        } catch (IOException error) {
            System.out.println("Oh, no!");
        }
    }
}


// Create a method that decrypts reversed-order.txt