/*
 * Name: Brendan Tea
 * Date: November 4th, 2025
 * Description: Fare super class with its encapsulated states.
 * 
 */

public class Fare {
    private static double fare = 5.0;
    private static String color = "Red";

    public double getFare(){
        return Fare.fare;
    }

    public String getColor(){
        return Fare.color;
    }
    
    public void printInfo() {
        System.out.printf("Senior fare: %.1f Color: %s %n", this.getFare(), this.getColor());
    }
}
