import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
    public static void main(String[] args) {

        Path sourceFile = Paths.get("my-file.txt");
        Path newFile = Paths.get("my-file-copy.txt");
        if (CopyFile(sourceFile, newFile)) {
            System.out.println("File was succesfully copied. ");
        }

    }

    public static boolean CopyFile(Path sourceFile, Path newFile) {

       try {
           Files.copy(sourceFile, newFile);
           return true;
       } catch (IOException e){
           System.out.println("couldn't write into the file");
       }

       return false;
    }
}


// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful