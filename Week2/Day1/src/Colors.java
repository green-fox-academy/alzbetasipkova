public class Colors {
    public static void main(String[] args){

        String[][] colors = new String[3][];

        String[] green = {"lime", "forest green", "olive", "pale green", "spring green"};

        String[] red = {"orange ren", "red", "tomato"};

        String[] pink = {"orchid", "violet", "pink", "hot pink"};

        colors[0] = green;
        colors[1] = red;
        colors[2] = pink;

        for (String[] colorArray : colors) {

            for (String color : colorArray) {

                System.out.println(color);
            }



        }

    }
}





// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`