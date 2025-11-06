// person struct
public class person {
    private String name;
    private BusFare type;

    person(String name, BusFare type) {
        this.name = name;
        this.type = type;
    }

    public void output() {
        this.type.fare(this.name);
    }
}