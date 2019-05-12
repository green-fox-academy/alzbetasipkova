package cloneable;

public class Student extends Person implements cloneable {

    int skippedDays;
    String previousOrganization;

    public Student() {
        super();
    }


    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
    }


    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer.\"");
    }


    @Override
    public void introduce() {
        System.out.println("I'm " + name + " , a " + age + " year old " + gender + " from "
                + previousOrganization + " who skipped " + skippedDays + " from the course already.");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }

    @Override
    public void clone(Student inputStudent) {
        Student clonedStudent = new Student();
        clonedStudent = inputStudent;
        clonedStudent.name = inputStudent.name + "-TheClone";

        System.out.println("You have cloned a new student who introduce himself:  ");
        clonedStudent.introduce();
    }
}
