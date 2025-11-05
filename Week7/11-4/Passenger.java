/*
 * Name: Brendan Tea
 * Date: November 4th, 2025
 * Description: Passenger sub class with it's own states and properties
 * 
 */

public class Passenger extends Fare {
    private static double discount = 1;

    @Override
    public double getFare() {
        return (super.getFare() * discount);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

}
