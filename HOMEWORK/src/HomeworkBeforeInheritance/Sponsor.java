package HomeworkBeforeInheritance;

public class Sponsor {

    String name;
    int age;
    String gender;
    String company;
    int hiredStudents;

    public Sponsor(String name, int age, String gender, String company){

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
    }

    public Sponsor(){

        name = "Jane Doe";
        age = 30;
        gender = "female";
        company = "Google";
        hiredStudents = 0;

    }


    public void introduce(){
        System.out.println("Hi, I'm  " + name + ", a " + age + " year old " + gender +
                " who represents " + company + " and hired " + hiredStudents + " so far. ");
    }


    public int hire(){

        return hiredStudents++;
    }


    public void getGoal(){

        System.out.println("Hire brilliant junior software developers.");
    }


}
