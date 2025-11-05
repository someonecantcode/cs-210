/*
 * Name: Brendan Tea
 * Date: November 4th, 2025
 * Description: Senior sub class with it's own states and properties
 * 
 */

public class Senior extends Fare {
    private static double discount = 0.5;
    private static String color = "Grey";

    @Override
    public double getFare(){
        return (super.getFare() * discount);
    }

    @Override
    public String getColor() {
        return Senior.color;
    }

}
