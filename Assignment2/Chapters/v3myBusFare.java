
class person {

    String name;
    BusFare type;

    person(String name, BusFare type) {
        this.name = name;
        this.type = type;
    }

}

public class v3myBusFare {

    public static void main(String[] args) {
        // Senior Ted = new Senior();
        // SuperSenior Ed = new SuperSenior();
        // Adult Chloe = new Adult();

        person[] peoples = {
            new person("Chloe", new Adult()),
            new person("Ted", new Senior()),
            new person("Ed", new SuperSenior())
        };

        for (person p : peoples) {
            p.type.fare(p.name);
        }

    }
}
