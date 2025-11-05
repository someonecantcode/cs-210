/*
 * Name: Brendan Tea
 * Date: November 11, 2025
 * Description: Prints out left and right aligned float
 * 
 */

class person {
    String name;
    BusFare type;

    person(String name, BusFare type){
        this.name = name;
        this.type = type;
    }
}

public class myBusFare {
    public static void main(String[] args) {
        // Senior Ted = new Senior();
        // SuperSenior Ed = new SuperSenior();
        // Adult Chloe = new Adult();

        person[] persons = {
            new person("Ted", new Senior()),
            new person("Ed", new SuperSenior()),
            new person("Chloe", new Adult())
        };

        for(person p : persons){
            p.type.fare(p.name);
        }

    }
}
