/*
 * Name: Brendan Tea
 * Date: November 11, 2025
 * Description: Main program runs here. 
 * 
 */

public class myBusFare {
    // We add our people and run our outputs.
    public static void main(String[] args) {
        // Senior Ted = new Senior();
        // SuperSenior Ed = new SuperSenior();
        // Adult Chloe = new Adult();

        persons p = new persons();
        p.add(new person("Ted", new Senior()));
        p.add(new person("Chloe", new Adult()));
        p.add(new person("Ed", new SuperSenior()));

        p.output();

    }
}
