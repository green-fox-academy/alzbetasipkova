package PostIt;

public class main {

    public static void main(String[] args) {

        postIt postIt1 = new postIt("orange", "Idea 1", "blue");
        postIt postIt2 = new postIt("pink", "Awesome", "black");
        postIt postIt3 = new postIt("yellow", "Superb!", "green");

        System.out.println(postIt1.backgroundColor + ", " + postIt1.text + ", " + postIt1.textColor);
        System.out.println(postIt2.backgroundColor + ", " + postIt2.text + ", " + postIt2.textColor);
        System.out.println(postIt3.backgroundColor + ", " + postIt3.text + ", " + postIt3.textColor);
    }
}