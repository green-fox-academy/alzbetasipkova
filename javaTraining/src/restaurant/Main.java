package restaurant;

public class Main {
    public static void main(String[] args) {

        Restaurant atBettys = new Restaurant("At Betty's ", 1993);
        Manager bob = new Manager("Bob", 290);
        Chef rob = new Chef("Rob", 987);
        Waiter matus = new Waiter("Matus", 0);

        atBettys.hire(bob);
        atBettys.hire(rob);
        atBettys.hire(matus);

        rob.cook("meat balls");
        rob.cook("blue balls");
        rob.cook("meat balls");

        atBettys.guestsArrived();
        rob.printMeals();
    }

}
