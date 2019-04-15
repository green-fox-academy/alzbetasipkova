import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {

        Path filePath = Paths.get("my-file.txt");
        String content = "Bettynka";
        manipFile(filePath, content);

    }

    public static void manipFile(Path filePath, String content) {

        List<String> contentList = new ArrayList();
        contentList.add(content);
        try {
            Files.write(filePath, contentList);
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }


    }
}

// Write a function that is able to manipulate a file
// By writing your name into it as a single line
// The file should be named "my-file.txt"
// In case the program is unable to write the file,
// It should print the following error message: "Unable to write file: my-file.txt"
