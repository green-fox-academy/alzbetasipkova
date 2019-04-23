package GreenFoxInheritanceExercise;

import java.util.ArrayList;

public class Cohort {

    String name;
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Mentor> mentors = new ArrayList<Mentor>();


    public Cohort(String name) {
        this.name = name;
    }

    public void addStudent(Student givenStudent){
        students.add(givenStudent);
    }

    public void addMentor(Mentor givenMentor){
        mentors.add(givenMentor);
    }

}
