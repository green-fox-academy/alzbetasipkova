import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {

        reversedLines("/Users/bettynka/Desktop/GreenFox/alzbetasipkova/javaTraining/Reversed-lines.txt");

    }


    public static void reversedLines(String fileName) {

        Path path = Paths.get(fileName);

        try {

            List<String> decrypted = Files.readAllLines(path);

            for (int i = 0; i < decrypted.size(); i++) {
                for (int j = decrypted.get(i).length() - 1; j >= 0; j--) {

                    System.out.print(decrypted.get(i).charAt(j));
                }

                System.out.println();
            }

        } catch (IOException error) {
            System.out.println("Error :-(");
        }
    }
}


// Create a method that decrypts reversed-lines.txt