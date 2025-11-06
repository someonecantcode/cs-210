/*
 * Name: Brendan Tea
 * Date: November 11, 2025
 * Description: Prints out left and right aligned float
 * 
 */

public class myBusFare {

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
