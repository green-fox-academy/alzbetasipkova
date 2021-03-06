
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {

        int lines = countLine("my-file.txt");
        System.out.println(lines);

    }

    public static int countLine(String fileName){

        try {
            Path filePath = Paths.get(fileName);
            List<String> lines = Files.readAllLines(filePath);
            return lines.size();

        } catch (IOException error){
            return 0;
        }
    }
}





// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.