package restaurant;

public abstract class Employee {

    private String name;
    protected int experience = 0;

    public Employee(String name){
        this.name = name;
    }


    public Employee(String name, int experience) {

        this.name = name;
        this.experience = experience;
    }


    public abstract void work();


}
