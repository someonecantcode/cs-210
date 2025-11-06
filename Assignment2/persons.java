/*
 * Name: Brendan Tea
 * Date: November 11, 2025
 * Description: Persons class contains all singular person.
 * 
 */

import java.util.ArrayList;

// We are using Arraylist and storing a class variable with all our people
public class persons {

    private static ArrayList<person> people;

    // if no parameters in the constructor, at least set some value to people
    persons() {
        this.people = new ArrayList<>();
    }

    persons(ArrayList<person> people) {
        persons.people = people;
    }

    public void add(person p) {
        persons.people.add(p);
    }

    // Main output function that allows to see how many people there are and their individual info
    public void output() {
        System.out.printf("%s total people %n", people.size());
        for (person p : people) {
            p.output();
        }
    }
}
