package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    String name;
    int yearFounded;
    List<Employee> employees = new ArrayList<>();

    public Restaurant(String name, int yearFounded) {

        this.name = name;
        this.yearFounded = yearFounded;
    }

    public void guestsArrived() {
        for (Employee employee : employees) {
            employee.work();
        }
    }

    public void hire(Employee employee) {

        employees.add(employee);

    }
}
