
import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class SwearWords {

  public static void main(String[] args) {


      removeWords("content.txt");

      System.out.println(removeWords("content.txt"));
  }

  public static int removeWords(String fileName){

      String [] swearW = {"fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt"};
      List<String> swearWords = new ArrayList<>(Arrays.asList(swearW));

      List<String> empty = new ArrayList<>();
      List<String> lines;
      String [] words;
      try {
          Path file = Paths.get(fileName);
          lines = Files.readAllLines(file);
      } catch (IOException error) {
          return 0;
      }

      for ( String line : lines) {
          words = line.split(" ");
          for ( String word : words ) {
              String s;
              s = word;
              if(word.length() > 0) s =  word.substring(0, word.length() - 1);
              if (swearWords.contains(word.toLowerCase()) || swearWords.contains(s.toLowerCase())){
                 empty.add(word);{
              }

          }
      }
  }
      return empty.size();
  }
}



  // ("fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt");



//Write a method which can read and parse a file containing not so family friendly text. The method must remove all the
// given words from the file and return the amount of the removed words.

