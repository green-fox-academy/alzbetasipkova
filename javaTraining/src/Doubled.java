import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {

        decryptFile("/Users/bettynka/Desktop/GreenFox/alzbetasipkova/javaTraining/src/duplicated-char.txt");
    }

    public static void decryptFile(String fileName) {

        Path path = Paths.get(fileName);
        List<String> text = new ArrayList<>();

        try {

            List<String> lines = Files.readAllLines(path);

            for (String s : lines) {
                String[] line = s.split("");
                String decrypted = "";
                for (int i = 0; i < line.length; i += 2) {
                    decrypted += line[i];
                }
                text.add(decrypted);
            }
            Path pathTWo = Paths.get("/Users/bettynka/Desktop/GreenFox/alzbetasipkova/javaTraining/src/duplicated-char.txt");
            Files.write(pathTWo, text);
        } catch (Exception error) {
            System.out.println("no file!");
        }

    }
}