import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Log {
    public static void main(String[] args) {

        Path logFile = Paths.get("log.txt");


        IPUnique(logFile);
    }

    public static void IPUnique(Path logfile) {

        try {
            List<String> logContent = Files.readAllLines(logfile);
            ArrayList<String> IPAdresses = new ArrayList<>();
            for (String line : logContent) {
                IPAdresses.add(line.substring(27, 40));
            }
            for (String IP : IPAdresses) {
                System.out.println(IP);
            }
        } catch (IOException error) {
            System.out.println("can't open file.");
        }
    }
}


// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.