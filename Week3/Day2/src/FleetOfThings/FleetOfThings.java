package FleetOfThings;

public class FleetOfThings {
    public static void main(String[] args) {

        Fleet fleet = new Fleet();

        Thing milk  = new Thing("Get milk");
        Thing obstacle  = new Thing("Remove the obstacles");
        Thing standUp  = new Thing("Stand up");
        Thing eatLunch  = new Thing("Eat lunch");

        standUp.complete();
        eatLunch.complete();

        fleet.add(milk);
        fleet.add(obstacle);
        fleet.add(standUp);
        fleet.add(eatLunch);


        System.out.println(fleet);

    }
}
