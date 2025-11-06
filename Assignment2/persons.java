
import java.util.ArrayList;

public class persons {

    private static ArrayList<person> people;

    persons() {
        this.people = new ArrayList<>();
    }

    persons(ArrayList<person> people) {
        persons.people = people;
    }

    public void add(person p) {
        persons.people.add(p);
    }

    public void output() {
        System.out.printf("%s total people %n", people.size());
        for (person p : people) {
            p.output();
        }
    }
}
