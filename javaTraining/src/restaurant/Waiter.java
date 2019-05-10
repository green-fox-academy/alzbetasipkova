package restaurant;

public class Waiter extends Employee {

    private int tips;

    public Waiter(String name, int experience) {

        super(name, experience);
        this.tips = 0;

    }

    public Waiter(String name) {
        super(name);
    }

    public void work(){

     tips += 1;
     this.experience = experience;

    }
}
