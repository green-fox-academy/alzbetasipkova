import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MostRainyDays {


    public static void main(String[] args) {
        HashMap<String, Integer> weatherMap = new HashMap<>();
        List<String> cities = getCities("/Users/bettynka/Desktop/GreenFox/alzbetasipkova/javaTraining/src/cities.csv");


        for (String line : cities) {
            String[] columns = line.split(",");
            String weather = columns[2];
            String city = columns[1];
            if (weather.equals("RAINY")) {
                saveIntoWeatherMap(city, weatherMap);
            }
            System.out.println(line);
        }
        System.out.println(Arrays.toString(weatherMap.entrySet().toArray()));

        findRainiestCity(weatherMap);
    }

    public static List<String> getCities(String fileName) {

        List<String> lines = new ArrayList<>();
        Path path = Paths.get(fileName);
        try {
            lines = Files.readAllLines(path);
        } catch (IOException error) {
            System.out.println("couldn't reach the file");
        }
        return lines;
    }

    public static void saveIntoWeatherMap(String city, HashMap<String, Integer> weatherMap) {
        if (weatherMap.containsKey(city)) {
            weatherMap.put(city, weatherMap.get(city) + 1);
        } else {
            weatherMap.put(city, 1);
        }
    }

    public static void findRainiestCity(HashMap<String, Integer> weatherMap) {

        String rainiestCity = "";
        int max = 0;
        for (String city : weatherMap.keySet()) {
            int rainyDaysAmount = weatherMap.get(city);
            if (rainyDaysAmount > max) {
                rainiestCity = city;
                max = rainyDaysAmount;
            }
        }

        System.out.println(rainiestCity);
    }
}


