/*
 * Name: Brendan Tea
 * Date: November 11, 2025
 * Description: Person "struct" class. Contains our fields for a person.
 * 
 */

// person struct
public class person {
    private String name;
    private BusFare type;

    // constructor everytime we make someone
    // fields are encapsulated so we must assign values when creating instances
    person(String name, BusFare type) {
        this.name = name;
        this.type = type;
    }

    // runtime polymorphism. Very efficient way to write this.
    // it actually runs the overriden subclass's fare method of the BusFare.
    public void output() {
        this.type.fare(this.name);
    }
}