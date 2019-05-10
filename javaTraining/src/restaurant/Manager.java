package restaurant;

public class Manager extends Employee {

    private int moodLevel;

    public Manager(String name, int experience) {
        super(name, experience);
        this.moodLevel = 400;
    }

    public Manager(String name){
        super(name);
    }

    @Override
    public void work() {
        this.experience += 1;
        meeting();

    }

    public void meeting() {

        moodLevel -= experience;
    }
}
